package com.demogreetingsapp.service;

import org.springframework.stereotype.Service;

import com.demogreetingsapp.repository.UserRepository;
import com.demogreetingsapp.model.User;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Constructor Injection
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean registerUser(User user) {

        User existingUser =
                userRepository.findByUsername(user.getUsername());

        if (existingUser != null) {
            return false;
        }

        userRepository.save(user);

        return true;
    }

    @Override
    public User loginUser(String username, String password) {

        return userRepository.findByUsernameAndPassword(
                username,
                password
        );
    }
}