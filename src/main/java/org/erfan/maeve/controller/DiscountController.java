package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Discount;
import org.erfan.maeve.service.DiscountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/discounts")
public class DiscountController extends BaseController<Discount, Long> {

    private final DiscountService service;

    public DiscountController(DiscountService service) {
        this.service = service;
    }

    @Override
    protected DiscountService getService() {
        return service;
    }
}

