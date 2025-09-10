package org.erfan.maeve.controller;

import org.erfan.maeve.service.BaseService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

public abstract class BaseController<T, ID> {

    protected abstract BaseService<T, ID> getService();

    @GetMapping
    public List<T> getAll() {
        return getService().findAll();
    }

    @GetMapping("/{id}")
    public Optional<T> getById(@PathVariable ID id) {
        return getService().findById(id);
    }

    @PostMapping
    public T create(@RequestBody T entity) {
        return getService().save(entity);
    }

    @PutMapping("/{id}")
    public T update(@PathVariable ID id, @RequestBody T entity) {
        return getService().save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {
        getService().delete(id); // Soft Delete اجرا میشه
    }
}

