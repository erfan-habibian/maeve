package org.erfan.maeve.controller;

import org.erfan.maeve.entity.FoodAndTag;
import org.erfan.maeve.service.FoodAndTagService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/food-tags")
public class FoodAndTagController extends BaseController<FoodAndTag, Long> {

    private final FoodAndTagService service;

    public FoodAndTagController(FoodAndTagService service) {
        this.service = service;
    }

    @Override
    protected FoodAndTagService getService() {
        return service;
    }
}

