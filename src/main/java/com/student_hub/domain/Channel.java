package com.student_hub.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "channel")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long channelId;
    @ManyToOne
    @JoinColumn(name = "admin_created_channel_user_id")
    private Admin adminCreatedChannel;


    protected Channel(){}
}
