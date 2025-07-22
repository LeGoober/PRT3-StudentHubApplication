package com.student_hub.factory;

import com.student_hub.domain.Products;
import com.student_hub.domain.UserProduct;
import com.student_hub.domain.enumerators.ReturnType;
import com.student_hub.util.Helper;

public class ProductFactory {

    public static Products createProduct(String productName, String productDescription, ReturnType returnType, UserProduct userProduct) {
        if (Helper.isNullOrEmpty(productName) || Helper.isNullOrEmpty(productDescription) || returnType == null || userProduct == null) {
            return null;
        }

        return Products.builder()
                .productId(Helper.generateId())
                .productName(productName)
                .productDescription(productDescription)
                .productReturnType(returnType)
                .userProduct(userProduct)
                .build();
    }
}