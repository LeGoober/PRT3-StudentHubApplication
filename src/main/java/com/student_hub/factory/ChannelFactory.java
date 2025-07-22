package com.student_hub.factory;

import com.student_hub.domain.Admin;
import com.student_hub.domain.Channel;
import com.student_hub.domain.enumerators.ChannelType;
import com.student_hub.util.Helper;

public class ChannelFactory {

    public static Channel createChannel(String channelName, ChannelType channelType, Admin admin) {
        if (Helper.isNullOrEmpty(channelName) || channelType == null || admin == null) {
            return null;
        }

        return Channel.builder()
                .channelId(Helper.generateId())
                .channelName(channelName)
                .channelType(channelType)
                .adminCreatedChannel(admin)
                .build();
    }
}