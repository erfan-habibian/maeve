package org.erfan.maeve.service;

import org.erfan.maeve.dto.JwtResponse;
import org.erfan.maeve.dto.SignUpRequest;

public interface AuthService {
    Long login(String username, String password);
    Long  signUp(SignUpRequest request);
}