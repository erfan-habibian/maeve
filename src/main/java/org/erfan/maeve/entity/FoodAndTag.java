package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "food_and_tag")
@SQLDelete(sql = "UPDATE foods_and_tags SET is_active = false WHERE foods_and_tags_id = ?")
@Where(clause = "is_active = true")
public class FoodAndTag extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodAndTagId;

    private Long foodId;
    private Long tagId;

    // Getter & Setter
    public Long getFoodAndTagId() { return foodAndTagId; }
    public void setFoodAndTagId(Long foodAndTagId) { this.foodAndTagId = foodAndTagId; }

    public Long getFoodId() { return foodId; }
    public void setFoodId(Long foodId) { this.foodId = foodId; }

    public Long getTagId() { return tagId; }
    public void setTagId(Long tagId) { this.tagId = tagId; }
}

