package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "responsibility")
@SQLDelete(sql = "UPDATE responsibility SET is_active = false WHERE responsibility_id = ?")
@Where(clause = "is_active = true")
public class Responsibility extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responsibilityId;

    private String responsibilityTitle;

    // Getter & Setter
    public Long getResponsibilityId() { return responsibilityId; }
    public void setResponsibilityId(Long responsibilityId) { this.responsibilityId = responsibilityId; }

    public String getResponsibilityTitle() { return responsibilityTitle; }
    public void setResponsibilityTitle(String title) { this.responsibilityTitle = title; }
}

