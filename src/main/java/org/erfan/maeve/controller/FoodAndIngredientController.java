package org.erfan.maeve.controller;

import org.erfan.maeve.entity.FoodAndIngredient;
import org.erfan.maeve.service.FoodAndIngredientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/food-ingredients")
public class FoodAndIngredientController extends BaseController<FoodAndIngredient, Long> {

    private final FoodAndIngredientService service;

    public FoodAndIngredientController(FoodAndIngredientService service) {
        this.service = service;
    }

    @Override
    protected FoodAndIngredientService getService() {
        return service;
    }
}

