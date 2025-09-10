package org.erfan.maeve.repository;

import org.erfan.maeve.entity.FoodAndTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodAndTagRepository extends JpaRepository<FoodAndTag, Long> {
}

