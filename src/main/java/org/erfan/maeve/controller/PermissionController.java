package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Permission;
import org.erfan.maeve.service.PermissionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController extends BaseController<Permission, Long> {

    private final PermissionService service;

    public PermissionController(PermissionService service) {
        this.service = service;
    }

    @Override
    protected PermissionService getService() {
        return service;
    }
}

