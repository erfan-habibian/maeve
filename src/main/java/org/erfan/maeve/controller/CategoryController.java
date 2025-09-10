package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Category;
import org.erfan.maeve.service.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController extends BaseController<Category, Long> {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @Override
    protected CategoryService getService() {
        return service;
    }
}

