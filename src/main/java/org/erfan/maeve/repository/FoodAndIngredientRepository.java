package org.erfan.maeve.repository;

import org.erfan.maeve.entity.FoodAndIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodAndIngredientRepository extends JpaRepository<FoodAndIngredient, Long> {
}
