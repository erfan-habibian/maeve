package org.erfan.maeve.service;

import org.erfan.maeve.entity.FoodAndIngredient;
import org.erfan.maeve.repository.FoodAndIngredientRepository;
import org.springframework.stereotype.Service;

@Service
public class FoodAndIngredientService extends BaseService<FoodAndIngredient, Long> {

    private final FoodAndIngredientRepository repository;

    public FoodAndIngredientService(FoodAndIngredientRepository repository) {
        this.repository = repository;
    }

    @Override
    protected FoodAndIngredientRepository getRepository() {
        return repository;
    }
}
