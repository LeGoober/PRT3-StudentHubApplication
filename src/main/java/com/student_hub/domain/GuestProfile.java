package com.student_hub.domain;

import com.student_hub.domain.enumerators.UserProfileType;
import com.student_hub.domain.enumerators.UserRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "guest_profile") // Specific table for Students' unique attributes
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@DiscriminatorValue("GUEST")
@SuperBuilder
public class GuestProfile extends User {

}
