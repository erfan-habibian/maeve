package org.erfan.maeve.service.impl;

import org.erfan.maeve.dto.JwtResponse;
import org.erfan.maeve.dto.SignUpRequest;
import org.erfan.maeve.entity.Customer;
import org.erfan.maeve.repository.CustomerRepository;
import org.erfan.maeve.security.JwtUtil;
import org.erfan.maeve.service.AuthService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final CustomerRepository customerRepository;
    private final JwtUtil jwtUtil;
    private final BCryptPasswordEncoder passwordEncoder;

    public AuthServiceImpl(CustomerRepository customerRepository, JwtUtil jwtUtil) {
        this.customerRepository = customerRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public JwtResponse login(String username, String password) {
        Customer customer = customerRepository.findAll().stream()
                .filter(c -> c.getUserName().equals(username))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(password, customer.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtUtil.generateToken(customer.getUserName());
        return new JwtResponse(token);
    }

    @Override
    public JwtResponse signUp(SignUpRequest request) {
        Customer customer = new Customer();
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setEmail(request.getEmail());
        customer.setAddress(request.getAddress());
        customer.setUserName(request.getUsername());
        customer.setPassword(passwordEncoder.encode(request.getPassword()));
        customer.setIsActive(true);

        customerRepository.save(customer);

        String token = jwtUtil.generateToken(customer.getUserName());
        return new JwtResponse(token);
    }
}

