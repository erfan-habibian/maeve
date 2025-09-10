package org.erfan.maeve.service.impl;

import org.erfan.maeve.entity.Customer;
import org.erfan.maeve.repository.CustomerRepository;
import org.erfan.maeve.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<Customer, Long> {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    protected CustomerRepository getRepository() {
        return customerRepository;
    }

    public Customer findByEmail(String email) {
        return customerRepository.findAll().stream()
                .filter(c -> c.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
}

