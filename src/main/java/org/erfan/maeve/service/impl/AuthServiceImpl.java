package org.erfan.maeve.service.impl;

import org.erfan.maeve.dto.SignUpRequest;
import org.erfan.maeve.entity.AppException;
import org.erfan.maeve.entity.Customer;
import org.erfan.maeve.entity.ErrorCode;
import org.erfan.maeve.repository.CustomerRepository;
import org.erfan.maeve.service.AuthService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final CustomerRepository customerRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AuthServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public Long login(String username, String password) {
        Customer customer = customerRepository.findAll().stream()
                .filter(c -> c.getUserName().equals(username))
                .findFirst()
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_FOUND));

        if (!passwordEncoder.matches(password, customer.getPassword())) {
            throw new AppException(ErrorCode.INVALID_PASSWORD);
        }

        return customer.getCustomerId();
    }

    @Override
    public Long signUp(SignUpRequest request) {
        if (customerRepository.findByUserName(request.getUsername()).isPresent()) {
            throw new AppException(ErrorCode.USER_ALREADY_EXISTS);
        }
        Customer customer = new Customer();
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setEmail(request.getEmail());
        customer.setAddress(request.getAddress());
        customer.setUserName(request.getUsername());
        customer.setPassword(passwordEncoder.encode(request.getPassword()));
        customer.setIsActive(true);

        Customer saved = customerRepository.save(customer);

        return saved.getCustomerId();
    }
}

