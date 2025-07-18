package com.student_hub.factory;

import com.student_hub.domain.User;
import com.student_hub.domain.enumerators.UserRole;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UserFactory {
    public static User createUser(
            Long userId,
            String userFirstName,
            String userLastName,
            UserRole userRole,
            String userEmail,
            String userPassword

    ) {

        return User.builder()
                .userId(userId)
                .userFirstName(userFirstName)
                .userLastName(userLastName)
                .userRole(userRole)
                .userEmail(userEmail)
                .userPassword(userPassword)
                .build();
    }
}
