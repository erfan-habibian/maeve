package org.erfan.maeve.repository;

import org.erfan.maeve.entity.CartAndOrderedFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartAndOrderedFoodRepository extends JpaRepository<CartAndOrderedFood, Long> {
}
