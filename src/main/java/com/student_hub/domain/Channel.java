package com.student_hub.domain;

import com.student_hub.domain.enumerators.ChannelType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "channel")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long channelId;

    @ManyToOne
    @JoinColumn(name = "admin_created_channel_user_id")
    private Admin adminCreatedChannel;

    @OneToMany(mappedBy = "channel", cascade = CascadeType.ALL)
    private Set<UserPost> userPosts;

    @Enumerated(EnumType.STRING)
    private ChannelType channelType;

    private String channelName;
}

