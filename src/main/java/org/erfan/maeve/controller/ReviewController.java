package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Review;
import org.erfan.maeve.service.impl.ReviewService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController extends BaseController<Review, Long> {

    private final ReviewService service;

    public ReviewController(ReviewService service) {
        this.service = service;
    }

    @Override
    protected ReviewService getService() {
        return service;
    }
}

