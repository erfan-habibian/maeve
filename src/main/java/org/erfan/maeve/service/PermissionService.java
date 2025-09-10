package org.erfan.maeve.service;

import org.erfan.maeve.entity.Permission;
import org.erfan.maeve.repository.PermissionRepository;
import org.springframework.stereotype.Service;

@Service
public class PermissionService extends BaseService<Permission, Long> {

    private final PermissionRepository repository;

    public PermissionService(PermissionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected PermissionRepository getRepository() {
        return repository;
    }
}

