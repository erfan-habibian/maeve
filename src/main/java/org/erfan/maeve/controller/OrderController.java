package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Order;
import org.erfan.maeve.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController extends BaseController<Order, Long> {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @Override
    protected OrderService getService() {
        return service;
    }
}
