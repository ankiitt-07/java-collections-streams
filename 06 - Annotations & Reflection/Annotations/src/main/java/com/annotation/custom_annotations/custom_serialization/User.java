package com.annotation.custom_annotations.custom_serialization;

public class User {
    @JsonField(key = "Name")
    String name;
    @JsonField(key = "Role")
    String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
