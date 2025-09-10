package org.erfan.maeve.controller;

import org.erfan.maeve.entity.Tag;
import org.erfan.maeve.service.TagService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tags")
public class TagController extends BaseController<Tag, Long> {

    private final TagService service;

    public TagController(TagService service) {
        this.service = service;
    }

    @Override
    protected TagService getService() {
        return service;
    }
}

