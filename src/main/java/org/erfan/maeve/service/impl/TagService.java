package org.erfan.maeve.service.impl;

import org.erfan.maeve.entity.Tag;
import org.erfan.maeve.repository.TagRepository;
import org.erfan.maeve.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class TagService extends BaseService<Tag, Long> {

    private final TagRepository repository;

    public TagService(TagRepository repository) {
        this.repository = repository;
    }

    @Override
    protected TagRepository getRepository() {
        return repository;
    }
}

