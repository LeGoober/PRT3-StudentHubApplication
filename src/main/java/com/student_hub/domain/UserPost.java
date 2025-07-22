package com.student_hub.domain;

import com.student_hub.domain.enumerators.UserPostType;
import com.student_hub.domain.enumerators.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.nio.channels.Channel;
import java.time.LocalDate;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user_posts")
public class UserPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userPostId;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "user_post")
    private User user;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "user_channel")
    private Channel

    @Enumerated(EnumType.STRING)
    private UserPostType userPostType;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private LocalDate postTimestamp;
    private boolean isModeratedPost;
    private boolean isUserChannelModerator;


    protected UserPost(){}
}
