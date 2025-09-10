package org.erfan.maeve.repository;

import org.erfan.maeve.entity.Responsibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsibilityRepository extends JpaRepository<Responsibility, Long> {
}

