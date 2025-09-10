package org.erfan.maeve.controller;

import org.erfan.maeve.entity.CartAndOrderedFood;
import org.erfan.maeve.service.impl.CartAndOrderedFoodService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart-ordered-foods")
public class CartAndOrderedFoodController extends BaseController<CartAndOrderedFood, Long> {

    private final CartAndOrderedFoodService service;

    public CartAndOrderedFoodController(CartAndOrderedFoodService service) {
        this.service = service;
    }

    @Override
    protected CartAndOrderedFoodService getService() {
        return service;
    }
}

