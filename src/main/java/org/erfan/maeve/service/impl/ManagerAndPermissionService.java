package org.erfan.maeve.service.impl;

import org.erfan.maeve.entity.ManagerAndPermission;
import org.erfan.maeve.repository.ManagerAndPermissionRepository;
import org.erfan.maeve.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ManagerAndPermissionService extends BaseService<ManagerAndPermission, Long> {

    private final ManagerAndPermissionRepository repository;

    public ManagerAndPermissionService(ManagerAndPermissionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected ManagerAndPermissionRepository getRepository() {
        return repository;
    }
}

