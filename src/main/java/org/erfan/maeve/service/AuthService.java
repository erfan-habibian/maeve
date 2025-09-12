package org.erfan.maeve.service;

import org.erfan.maeve.dto.JwtResponse;
import org.erfan.maeve.dto.SignUpRequest;

public interface AuthService {
    JwtResponse login(String username, String password);
    JwtResponse  signUp(SignUpRequest request);
}