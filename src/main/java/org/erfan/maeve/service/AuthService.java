package org.erfan.maeve.service;

import org.erfan.maeve.dto.SignUpRequest;

public interface AuthService {
    String login(String username, String password);
    void signUp(SignUpRequest request);
}