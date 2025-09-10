package org.erfan.maeve.service.impl;

import org.erfan.maeve.entity.Responsibility;
import org.erfan.maeve.repository.ResponsibilityRepository;
import org.erfan.maeve.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ResponsibilityService extends BaseService<Responsibility, Long> {

    private final ResponsibilityRepository repository;

    public ResponsibilityService(ResponsibilityRepository repository) {
        this.repository = repository;
    }

    @Override
    protected ResponsibilityRepository getRepository() {
        return repository;
    }
}

