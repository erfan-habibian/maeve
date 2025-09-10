package org.erfan.maeve.service;

import org.erfan.maeve.entity.Chef;
import org.erfan.maeve.repository.ChefRepository;
import org.springframework.stereotype.Service;

@Service
public class ChefService extends BaseService<Chef, Long> {

    private final ChefRepository repository;

    public ChefService(ChefRepository repository) {
        this.repository = repository;
    }

    @Override
    protected ChefRepository getRepository() {
        return repository;
    }
}

