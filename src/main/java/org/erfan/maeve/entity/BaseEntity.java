package org.erfan.maeve.entity;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    private Boolean isActive = true;

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }
}
