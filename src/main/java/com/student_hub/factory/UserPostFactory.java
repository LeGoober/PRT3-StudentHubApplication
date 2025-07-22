package com.student_hub.factory;

import com.student_hub.domain.Channel;
import com.student_hub.domain.User;
import com.student_hub.domain.UserPost;
import com.student_hub.domain.enumerators.UserPostType;
import com.student_hub.util.Helper;

import java.time.LocalDate;

public class UserPostFactory {

    public static UserPost createUserPost(User user, Channel channel, UserPostType postType, String content) {
        if (user == null || channel == null || postType == null || Helper.isNullOrEmpty(content)) {
            return null;
        }

        return new UserPost.Builder()
                .userPostId(Helper.generateId())
                .user(user)
                .channel(channel)
                .userPostType(postType)
                .postTimestamp(LocalDate.now())
                .build();
    }
}
