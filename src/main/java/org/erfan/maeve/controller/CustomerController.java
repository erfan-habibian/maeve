package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Customer;
import org.erfan.maeve.service.impl.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController extends BaseController<Customer, Long> {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @Override
    protected CustomerService getService() {
        return service;
    }
}

