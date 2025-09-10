package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Chef;
import org.erfan.maeve.service.impl.ChefService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chefs")
public class ChefController extends BaseController<Chef, Long> {

    private final ChefService service;

    public ChefController(ChefService service) {
        this.service = service;
    }

    @Override
    protected ChefService getService() {
        return service;
    }
}

