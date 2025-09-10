package org.erfan.maeve.service;

import org.erfan.maeve.entity.Cart;
import org.erfan.maeve.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService extends BaseService<Cart, Long> {

    private final CartRepository repository;

    public CartService(CartRepository repository) {
        this.repository = repository;
    }

    @Override
    protected CartRepository getRepository() {
        return repository;
    }
}

