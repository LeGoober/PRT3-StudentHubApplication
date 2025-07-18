package com.student_hub.domain.enumerators;

public enum ChannelType {
    PUBLIC_FORUM("🗣️ Open Discussion"),
    PRIVATE_GROUP("🤫 Secret Society"),
    ACADEMIC_HELP("🤓 Study Corner"),
    SOCIAL_LOUNGE("🥳 Hangout Spot"),
    EVENT_ANNOUNCEMENT("📢 What's Happening!");

    private final String description;

    ChannelType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}