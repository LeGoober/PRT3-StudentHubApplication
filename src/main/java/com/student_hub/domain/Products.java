package com.student_hub.domain;

import com.student_hub.domain.enumerators.ReturnType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor (access = AccessLevel.PROTECTED)
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    @Enumerated(EnumType.STRING)
    private ReturnType productReturnType;
    private String productDescription;

    protected Products() {}

}
