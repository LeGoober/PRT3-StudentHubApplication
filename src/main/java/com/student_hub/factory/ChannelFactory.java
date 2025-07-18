package com.student_hub.factory;

import com.student_hub.domain.Admin;
import com.student_hub.domain.Channel;

public class ChannelFactory {
    public static Channel createChannel(
            Long channelId,
            Admin adminCreatedChannel
    ){

        return Channel.builder()
                .channelId(channelId)
                .adminCreatedChannel(adminCreatedChannel)
                .build();
    }
}
