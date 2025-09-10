package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Ingredient;
import org.erfan.maeve.service.impl.IngredientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientController extends BaseController<Ingredient, Long> {

    private final IngredientService service;

    public IngredientController(IngredientService service) {
        this.service = service;
    }

    @Override
    protected IngredientService getService() {
        return service;
    }
}

