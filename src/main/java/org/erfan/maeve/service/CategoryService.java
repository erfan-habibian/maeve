package org.erfan.maeve.service;

import org.erfan.maeve.entity.Category;
import org.erfan.maeve.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends BaseService<Category, Long> {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    protected CategoryRepository getRepository() {
        return repository;
    }
}

