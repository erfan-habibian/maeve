package org.erfan.maeve.repository;

import org.erfan.maeve.entity.OrderedFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderedFoodRepository extends JpaRepository<OrderedFood, Long> {
}

