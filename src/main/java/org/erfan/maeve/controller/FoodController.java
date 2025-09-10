package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Food;
import org.erfan.maeve.service.impl.FoodService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/foods")
public class FoodController extends BaseController<Food, Long> {

    private final FoodService service;

    public FoodController(FoodService service) {
        this.service = service;
    }

    @Override
    protected FoodService getService() {
        return service;
    }
}
