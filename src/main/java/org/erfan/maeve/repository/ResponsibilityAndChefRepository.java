package org.erfan.maeve.repository;

import org.erfan.maeve.entity.ResponsibilityAndChef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsibilityAndChefRepository extends JpaRepository<ResponsibilityAndChef, Long> {
}

