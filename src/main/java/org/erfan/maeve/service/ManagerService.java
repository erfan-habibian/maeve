package org.erfan.maeve.service;

import org.erfan.maeve.entity.Manager;
import org.erfan.maeve.repository.ManagerRepository;
import org.springframework.stereotype.Service;

@Service
public class ManagerService extends BaseService<Manager, Long> {
    private final ManagerRepository repository;
    public ManagerService(ManagerRepository repository) { this.repository = repository; }
    @Override
    protected ManagerRepository getRepository() { return repository; }
}
