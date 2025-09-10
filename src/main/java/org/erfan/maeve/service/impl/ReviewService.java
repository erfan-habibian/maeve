package org.erfan.maeve.service.impl;

import org.erfan.maeve.entity.Review;
import org.erfan.maeve.repository.ReviewRepository;
import org.erfan.maeve.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ReviewService extends BaseService<Review, Long> {

    private final ReviewRepository repository;

    public ReviewService(ReviewRepository repository) {
        this.repository = repository;
    }

    @Override
    protected ReviewRepository getRepository() {
        return repository;
    }
}

