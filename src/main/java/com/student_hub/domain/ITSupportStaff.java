package com.student_hub.domain;

import com.student_hub.domain.enumerators.UserProfileType;
import com.student_hub.domain.enumerators.UserRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "it_support_staff") // Specific table for Students' unique attributes
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@DiscriminatorValue("IT_SUPPORT")
@SuperBuilder
public class ITSupportStaff extends User{
    private String facultyName;
    private String facultyDetails; // Assuming this is distinct from facultyName

    private String studentNumber; // Changed from int to String, student numbers are often not numeric
}
