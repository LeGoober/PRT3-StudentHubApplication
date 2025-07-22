package com.student_hub.domain;

import com.student_hub.domain.enumerators.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor
@Table(name ="user-profile")
public class UserProfile {
    @Id
    private Long profileId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "admin_id", referencedColumnName = "admin_id")
    private Admin admin;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User userId;

    private boolean isEntrepreneurUserProfileEnabled;
    private String sessionUrl;
    private String campusDetails;
    private String courseOStudy;
    private String securityOptions;
    private UserRole userRole;
    private String email;
    private String password;

    protected UserProfile() {}
}
