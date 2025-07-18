package com.student_hub.domain.enumerators;
public enum UserRole {
    ADMIN("👑 The Overlord"),
    STUDENT("📚 The Knowledge Seeker"),
    FACULTY_MEMBER("🧑‍🏫 The Wisdom Giver"),
    IT_SUPPORT_STAFF("🛠️ The Problem Solver"),
    GUEST("🚶‍♂️ The Curious Visitor"),
    ENTREPRENEUR("💡 The Idea Generator");

    private final String description;

    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}