package com.customannotations.advancedlevel.jsonserialization;

public class UserDTO {

    @JsonField(name = "user_name")
    String username;

    UserDTO(String username) {
        this.username = username;
    }
}