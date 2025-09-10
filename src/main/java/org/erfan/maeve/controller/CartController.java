package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Cart;
import org.erfan.maeve.service.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carts")
public class CartController extends BaseController<Cart, Long> {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @Override
    protected CartService getService() {
        return service;
    }
}

