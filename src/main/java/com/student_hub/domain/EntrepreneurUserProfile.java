package com.student_hub.domain;

import lombok.Getter;

import java.util.Objects;

public class EntrepreneurUserProfile {
    @Getter
    private int profileId;
    private Boolean isCommercePortfolioEnabled;
    @Getter
    private String sessionURL;
    @Getter
    private UserProduct userProduct;

    public EntrepreneurUserProfile() {
    }
    private EntrepreneurUserProfile(Builder builder) {
        this.profileId = builder.profileId;
        this.isCommercePortfolioEnabled = builder.isCommercePortfolioEnabled;
        this.sessionURL = builder.sessionURL;
        this.userProduct = builder.userProduct;
    }

    public Boolean getCommercePortfolioEnabled() {
        return isCommercePortfolioEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EntrepreneurUserProfile that = (EntrepreneurUserProfile) o;
        return profileId == that.profileId && Objects.equals(isCommercePortfolioEnabled, that.isCommercePortfolioEnabled) && Objects.equals(sessionURL, that.sessionURL) && Objects.equals(userProduct, that.userProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId, isCommercePortfolioEnabled, sessionURL, userProduct);
    }

    @Override
    public String toString() {
        return "EntrepreneurUserProfile{" +
                "isCommercePortfolioEnabled=" + isCommercePortfolioEnabled +
                ", profileId=" + profileId +
                ", sessionURL='" + sessionURL + '\'' +
                ", userProduct=" + userProduct +
                '}';
    }
    public static class Builder {
        private int profileId;
        private Boolean isCommercePortfolioEnabled;
        private String sessionURL;
        private UserProduct userProduct;

        public Builder setProfileId(int profileId) {
            this.profileId = profileId;
            return this;
        }

        public Builder setCommercePortfolioEnabled(Boolean commercePortfolioEnabled) {
            isCommercePortfolioEnabled = commercePortfolioEnabled;
            return this;
        }

        public Builder setSessionURL(String sessionURL) {
            this.sessionURL = sessionURL;
            return this;
        }

        public Builder setUserProduct(UserProduct userProduct) {
            this.userProduct = userProduct;
            return this;
        }

        public Builder copy() {
            EntrepreneurUserProfile profile = new EntrepreneurUserProfile();
            profile.profileId = this.profileId;
            profile.isCommercePortfolioEnabled = this.isCommercePortfolioEnabled;
            profile.sessionURL = this.sessionURL;
            profile.userProduct = this.userProduct;
            return this;
        }
        public EntrepreneurUserProfile build() {
            return new EntrepreneurUserProfile(this);
        }


    }
}
