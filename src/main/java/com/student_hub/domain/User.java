package com.student_hub.domain;

import com.student_hub.domain.enumerators.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userFirstName;
    private String userLastName;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    private String userEmail;
    private String userPassword;

    protected User(){}
}
