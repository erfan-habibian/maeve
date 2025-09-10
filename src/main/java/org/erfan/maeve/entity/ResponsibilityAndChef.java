package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "responsibility_and_chef")
@SQLDelete(sql = "UPDATE responsibility_and_chef SET is_active = false WHERE responsibility_and_chef_id = ?")
@Where(clause = "is_active = true")
public class ResponsibilityAndChef extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responsibilityAndChefId;

    private Long responsibilityId;
    private Long chefId;

    // Getter & Setter
    public Long getResponsibilityAndChefId() { return responsibilityAndChefId; }
    public void setResponsibilityAndChefId(Long responsibilityAndChefId) { this.responsibilityAndChefId = responsibilityAndChefId; }

    public Long getResponsibilityId() { return responsibilityId; }
    public void setResponsibilityId(Long responsibilityId) { this.responsibilityId = responsibilityId; }

    public Long getChefId() { return chefId; }
    public void setChefId(Long chefId) { this.chefId = chefId; }
}

