package com.student_hub.domain;

import jakarta.persistence.Entity;
import lombok.Getter;

import java.util.Objects;

public class UserProduct {
    @Getter
    private String userProduct;
    @Getter
    private Products productName;
    private Boolean isEntrepreneurUserProfile;

    public UserProduct() {
    }
    private UserProduct(Builder builder) {
        this.userProduct = builder.userProduct;
        this.productName = builder.productName;
        this.isEntrepreneurUserProfile = builder.isEntrepreneurUserProfile;
    }

    public Boolean getEntrepreneurUserProfile() {
        return isEntrepreneurUserProfile;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserProduct that = (UserProduct) o;
        return Objects.equals(userProduct, that.userProduct) && Objects.equals(productName, that.productName) && Objects.equals(isEntrepreneurUserProfile, that.isEntrepreneurUserProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProduct, productName, isEntrepreneurUserProfile);
    }

    @Override
    public String toString() {
        return "UserProduct{" +
                "isEntrepreneurUserProfile=" + isEntrepreneurUserProfile +
                ", userProduct='" + userProduct + '\'' +
                ", productName=" + productName +
                '}';
    }
    public static class Builder {
        private String userProduct;
        private Products productName;
        private Boolean isEntrepreneurUserProfile;

        public Builder setUserProduct(String userProduct) {
            this.userProduct = userProduct;
            return this;
        }

        public Builder setProductName(Products productName) {
            this.productName = productName;
            return this;
        }

        public Builder setEntrepreneurUserProfile(Boolean isEntrepreneurUserProfile) {
            this.isEntrepreneurUserProfile = isEntrepreneurUserProfile;
            return this;
        }

        public Builder copy(UserProduct userProd) {
            UserProduct userProduct = new UserProduct();
            userProduct.userProduct = this.userProduct;
            userProduct.productName = this.productName;
            userProduct.isEntrepreneurUserProfile = this.isEntrepreneurUserProfile;
            return this;
        }
        public UserProduct build() {
            return new UserProduct(this);
        }
    }
}

