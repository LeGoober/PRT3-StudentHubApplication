package com.student_hub.factory;

import com.student_hub.domain.Products;
import com.student_hub.domain.enumerators.ReturnType;

public class ProductFactory {
    public static Products createProducts(
            Long productId,
            String productName,
            ReturnType productReturnType,
            String productDescription
    ){

        return Products.builder()
                .productId(productId)
                .productName(productName)
                .productReturnType(productReturnType)
                .productDescription(productDescription).build();

    }
}
