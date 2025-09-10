package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "manager_and_permission")
@SQLDelete(sql = "UPDATE manager_and_permission SET is_active = false WHERE manager_and_permission_id = ?")
@Where(clause = "is_active = true")
public class ManagerAndPermission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long managerAndPermissionId;

    private Long managerId;
    private Long permissionId;

    // Getter & Setter
    public Long getManagerAndPermissionId() { return managerAndPermissionId; }
    public void setManagerAndPermissionId(Long managerAndPermissionId) { this.managerAndPermissionId = managerAndPermissionId; }

    public Long getManagerId() { return managerId; }
    public void setManagerId(Long managerId) { this.managerId = managerId; }

    public Long getPermissionId() { return permissionId; }
    public void setPermissionId(Long permissionId) { this.permissionId = permissionId; }
}

