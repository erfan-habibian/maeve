package org.erfan.maeve.service.impl;

import org.erfan.maeve.entity.FoodAndTag;
import org.erfan.maeve.repository.FoodAndTagRepository;
import org.erfan.maeve.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class FoodAndTagService extends BaseService<FoodAndTag, Long> {

    private final FoodAndTagRepository repository;

    public FoodAndTagService(FoodAndTagRepository repository) {
        this.repository = repository;
    }

    @Override
    protected FoodAndTagRepository getRepository() {
        return repository;
    }
}

