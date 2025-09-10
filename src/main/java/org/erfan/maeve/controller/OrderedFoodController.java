package org.erfan.maeve.controller;

import org.erfan.maeve.entity.OrderedFood;
import org.erfan.maeve.service.OrderedFoodService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ordered-foods")
public class OrderedFoodController extends BaseController<OrderedFood, Long> {

    private final OrderedFoodService service;

    public OrderedFoodController(OrderedFoodService service) {
        this.service = service;
    }

    @Override
    protected OrderedFoodService getService() {
        return service;
    }
}

