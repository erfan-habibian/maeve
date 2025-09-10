package org.erfan.maeve.controller;

import org.erfan.maeve.entity.ResponsibilityAndChef;
import org.erfan.maeve.service.ResponsibilityAndChefService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/responsibility-chefs")
public class ResponsibilityAndChefController extends BaseController<ResponsibilityAndChef, Long> {

    private final ResponsibilityAndChefService service;

    public ResponsibilityAndChefController(ResponsibilityAndChefService service) {
        this.service = service;
    }

    @Override
    protected ResponsibilityAndChefService getService() {
        return service;
    }
}

