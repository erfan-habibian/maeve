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
        try {
            JwtResponse jwt = authService.signUp(request);
            return ResponseEntity.ok(jwt);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // ================= Login =================
    @PostMapping("/login")
    public ResponseEntity<?> login(String username, String password) {
        try {
            JwtResponse jwt = authService.login(username, password);
            return ResponseEntity.ok(jwt);
        } catch (RuntimeException e) {
            return ResponseEntity.status(401).body(e.getMessage());
        }
    }

    // ================= Logout =================
    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        // چون JWT stateless هست، Logout صرفاً سمت Client انجام میشه
        // یعنی Client باید Token رو پاک کنه
        return ResponseEntity.ok("Logged out successfully");
    }

}
