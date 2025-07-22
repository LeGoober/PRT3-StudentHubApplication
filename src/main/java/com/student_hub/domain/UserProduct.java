package com.student_hub.domain;

import com.student_hub.domain.enumerators.ReturnType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "user_product")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entrepreneur_profile_id")
    private EntrepreneurUserProfile entrepreneurProfile;

    @OneToMany(mappedBy = "userProduct", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Products> productsSet;

    @Enumerated(EnumType.STRING)
    private ReturnType returnType;

    private String productName;

    // Helper methods for bidirectional relationship management
    public void addProduct(Products product) {
        this.productsSet.add(product);
        product.setUserProduct(this);
    }

    public void removeProduct(Products product) {
        this.productsSet.remove(product);
        product.setUserProduct(null);
    }

}
