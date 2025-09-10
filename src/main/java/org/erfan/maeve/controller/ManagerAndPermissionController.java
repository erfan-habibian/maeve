package org.erfan.maeve.controller;

import org.erfan.maeve.entity.ManagerAndPermission;
import org.erfan.maeve.service.impl.ManagerAndPermissionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/manager-permissions")
public class ManagerAndPermissionController extends BaseController<ManagerAndPermission, Long> {

    private final ManagerAndPermissionService service;

    public ManagerAndPermissionController(ManagerAndPermissionService service) {
        this.service = service;
    }

    @Override
    protected ManagerAndPermissionService getService() {
        return service;
    }
}

