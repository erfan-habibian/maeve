package org.erfan.maeve.service;

import org.erfan.maeve.entity.Food;
import org.erfan.maeve.repository.FoodRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodService extends BaseService<Food, Long> {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    protected FoodRepository getRepository() {
        return foodRepository;
    }

    public List<Food> findByCategory(Long categoryId) {
        return foodRepository.findAll().stream()
                .filter(f -> f.getCategoryId().equals(categoryId))
                .toList();
    }
}

