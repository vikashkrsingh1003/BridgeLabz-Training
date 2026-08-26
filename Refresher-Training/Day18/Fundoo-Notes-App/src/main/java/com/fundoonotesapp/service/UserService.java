package com.fundoonotesapp.service;

import com.fundoonotesapp.dto.ForgotPasswordRequest;
import com.fundoonotesapp.dto.LoginRequest;
import com.fundoonotesapp.dto.RegisterRequest;
import com.fundoonotesapp.dto.ResetPasswordRequest;

public interface UserService {

    String register(RegisterRequest request);

    String login(LoginRequest request);

    String forgotPassword(ForgotPasswordRequest request);

    void resetPassword(ResetPasswordRequest request);
}