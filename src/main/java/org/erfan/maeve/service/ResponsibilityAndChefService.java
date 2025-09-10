package org.erfan.maeve.service;

import org.erfan.maeve.entity.ResponsibilityAndChef;
import org.erfan.maeve.repository.ResponsibilityAndChefRepository;
import org.springframework.stereotype.Service;

@Service
public class ResponsibilityAndChefService extends BaseService<ResponsibilityAndChef, Long> {

    private final ResponsibilityAndChefRepository repository;

    public ResponsibilityAndChefService(ResponsibilityAndChefRepository repository) {
        this.repository = repository;
    }

    @Override
    protected ResponsibilityAndChefRepository getRepository() {
        return repository;
    }
}

