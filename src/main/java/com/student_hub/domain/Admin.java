package com.student_hub.domain;

import com.student_hub.domain.enumerators.UserProfileType;
import com.student_hub.domain.enumerators.UserRole;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "admin") // Specific table for Students' unique attributes
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@DiscriminatorValue("ADMIN")
@SuperBuilder
public class Admin extends User {
    private String staffNumber;
}
