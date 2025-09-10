package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Responsibility;
import org.erfan.maeve.service.impl.ResponsibilityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/responsibilities")
public class ResponsibilityController extends BaseController<Responsibility, Long> {

    private final ResponsibilityService service;

    public ResponsibilityController(ResponsibilityService service) {
        this.service = service;
    }

    @Override
    protected ResponsibilityService getService() {
        return service;
    }
}

