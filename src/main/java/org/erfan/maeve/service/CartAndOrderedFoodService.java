package org.erfan.maeve.service;

import org.erfan.maeve.entity.CartAndOrderedFood;
import org.erfan.maeve.repository.CartAndOrderedFoodRepository;
import org.springframework.stereotype.Service;

@Service
public class CartAndOrderedFoodService extends BaseService<CartAndOrderedFood, Long> {

    private final CartAndOrderedFoodRepository repository;

    public CartAndOrderedFoodService(CartAndOrderedFoodRepository repository) {
        this.repository = repository;
    }

    @Override
    protected CartAndOrderedFoodRepository getRepository() {
        return repository;
    }
}
