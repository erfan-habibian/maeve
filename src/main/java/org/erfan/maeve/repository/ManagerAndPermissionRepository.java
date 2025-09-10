package org.erfan.maeve.repository;

import org.erfan.maeve.entity.ManagerAndPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerAndPermissionRepository extends JpaRepository<ManagerAndPermission, Long> {
}

