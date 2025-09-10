package org.erfan.maeve.service;

import org.erfan.maeve.entity.OrderedFood;
import org.erfan.maeve.repository.OrderedFoodRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderedFoodService extends BaseService<OrderedFood, Long> {

    private final OrderedFoodRepository repository;

    public OrderedFoodService(OrderedFoodRepository repository) {
        this.repository = repository;
    }

    @Override
    protected OrderedFoodRepository getRepository() {
        return repository;
    }
}

