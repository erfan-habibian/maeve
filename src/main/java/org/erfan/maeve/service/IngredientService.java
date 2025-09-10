package org.erfan.maeve.service;

import org.erfan.maeve.entity.Ingredient;
import org.erfan.maeve.repository.IngredientRepository;
import org.springframework.stereotype.Service;

@Service
public class IngredientService extends BaseService<Ingredient, Long> {

    private final IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }

    @Override
    protected IngredientRepository getRepository() {
        return repository;
    }
}

