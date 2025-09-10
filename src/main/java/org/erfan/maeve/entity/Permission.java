package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "permissions")
@SQLDelete(sql = "UPDATE permission SET is_active = false WHERE permission_id = ?")
@Where(clause = "is_active = true")
public class Permission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permissionId;

    private String permissionTitle;

    // Getter & Setter
    public Long getPermissionId() { return permissionId; }
    public void setPermissionId(Long permissionId) { this.permissionId = permissionId; }

    public String getPermissionTitle() { return permissionTitle; }
    public void setPermissionTitle(String permissionTitle) { this.permissionTitle = permissionTitle; }
}

