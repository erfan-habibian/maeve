package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Manager;
import org.erfan.maeve.service.impl.ManagerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/managers")
public class ManagerController extends BaseController<Manager, Long> {

    private final ManagerService service;

    public ManagerController(ManagerService service) {
        this.service = service;
    }

    @Override
    protected ManagerService getService() {
        return service;
    }
}

