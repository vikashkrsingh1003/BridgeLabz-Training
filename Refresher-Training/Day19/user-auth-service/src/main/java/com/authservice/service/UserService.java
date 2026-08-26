package com.authservice.service;

import com.authservice.dto.ForgotPasswordRequest;
import com.authservice.dto.LoginRequest;
import com.authservice.dto.RegisterRequest;
import com.authservice.dto.ResetPasswordRequest;

public interface UserService {

    String register(RegisterRequest request);

    String login(LoginRequest request);

    String forgotPassword(ForgotPasswordRequest request);

    void resetPassword(ResetPasswordRequest request);
}