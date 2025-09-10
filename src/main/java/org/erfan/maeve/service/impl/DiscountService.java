package org.erfan.maeve.service.impl;

import org.erfan.maeve.entity.Discount;
import org.erfan.maeve.repository.DiscountRepository;
import org.erfan.maeve.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class DiscountService extends BaseService<Discount, Long> {

    private final DiscountRepository repository;

    public DiscountService(DiscountRepository repository) {
        this.repository = repository;
    }

    @Override
    protected DiscountRepository getRepository() {
        return repository;
    }
}

