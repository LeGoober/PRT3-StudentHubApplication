package com.student_hub.domain;

import com.student_hub.domain.enumerators.ReturnType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter // Added @Setter for convenience in managing relationships
@Builder
@ToString(exclude = {"userProduct"}) // Exclude collections from toString to prevent infinite loops
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_product_id", nullable = false)
    private UserProduct userProduct;

    private String productName;
    private String productDescription;

    @Enumerated(EnumType.STRING)
    private ReturnType productReturnType;

}
