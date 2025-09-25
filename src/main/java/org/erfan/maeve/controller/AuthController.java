package org.erfan.maeve.controller;

import org.erfan.maeve.dto.JwtResponse;
import org.erfan.maeve.dto.SignUpRequest;
import org.erfan.maeve.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // ================= Sign Up =================
    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody SignUpRequest request) {
        Long customerId = authService.signUp(request);
        return ResponseEntity.ok(customerId);
    }

    // ================= Login =================
    @PostMapping("/login")
    public ResponseEntity<?> login(String username, String password) {
        Long customerId = authService.login(username, password);
        return ResponseEntity.ok(customerId);
    }

    // ================= Logout =================
    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        return ResponseEntity.ok("Logged out successfully");
    }

}
