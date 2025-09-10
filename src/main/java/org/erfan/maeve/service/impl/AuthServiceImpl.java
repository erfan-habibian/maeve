package org.erfan.maeve.service.impl;

import org.erfan.maeve.dto.SignUpRequest;
import org.erfan.maeve.entity.Customer;
import org.erfan.maeve.security.JwtUtil;
import org.erfan.maeve.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final CustomerService customerService;
    private final JwtUtil jwtUtil;

    public AuthServiceImpl(CustomerService customerService, JwtUtil jwtUtil) {
        this.customerService = customerService;
        this.jwtUtil = jwtUtil;
    }

    @Override
    public String login(String username, String password) {
        Customer customer = customerService.findByUserName(username);
        if (!password.equals(customer.getPassword())) { // بعدا اینو با BCrypt درست می‌کنیم
            throw new RuntimeException("Invalid credentials");
        }
        return jwtUtil.generateToken(customer.getUserName());
    }

    @Override
    public void signUp(SignUpRequest request) {
        Customer customer = new Customer();
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setUserName(request.getUsername());
        customer.setPassword(request.getPassword()); // بعدا هش میشه
        customerService.save(customer);
    }
}

