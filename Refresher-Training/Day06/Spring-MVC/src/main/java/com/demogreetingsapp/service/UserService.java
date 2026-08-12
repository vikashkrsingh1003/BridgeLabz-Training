package com.demogreetingsapp.service;

import com.demogreetingsapp.model.User;

public interface UserService {

    boolean registerUser(User user);

    User loginUser(String username, String password);
}