package com.student_hub.domain.enumerators;

public enum UserProfileType {
    STUDENT_PROFILE("Basic Student Profile"),
    ENTREPRENEUR_PROFILE("Entrepreneur Student Profile"),
    ADMIN_PROFILE("Admin Profile");

    private final String description;
    UserProfileType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
