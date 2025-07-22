package com.student_hub.domain;

import com.student_hub.domain.enumerators.UserProfileType;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Getter
@Builder
@ToString(exclude = {"userProducts"}) // Exclude collections from toString to prevent infinite loops
@Table(name = "entrepreneur_profile")
@AllArgsConstructor
public class EntrepreneurUserProfile {
    @Id
    private Long id;

    private boolean isCommercePotrfolioEnabled;
    private String sessionUrl;

    private String biography;
    @Enumerated(EnumType.STRING)
    private UserProfileType userProfileType;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User userId;

    @OneToMany(mappedBy = "entrepreneurProfile", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UserProduct> userProducts;

    public EntrepreneurUserProfile() {

    }

}
