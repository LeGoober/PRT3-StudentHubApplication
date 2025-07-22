package com.student_hub.domain;

import com.student_hub.domain.enumerators.ChannelType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "channel_details")
public class ChannelDetails {
    @Id
    private Long channelId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "channel_id")
    private Channel channel;

    private String channelName;

    @ManyToOne
    @JoinColumn(name = "admin_created_channel_user_id")
    private Admin adminCreatedChannel;

    @Enumerated(EnumType.STRING)
    private ChannelType channelType;

    protected ChannelDetails() {}
}
