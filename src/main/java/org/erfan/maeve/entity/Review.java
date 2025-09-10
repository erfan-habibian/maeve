package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import java.util.Date;

@Entity
@Table(name = "review")
@SQLDelete(sql = "UPDATE review SET is_active = false WHERE review_id = ?")
@Where(clause = "is_active = true")
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    private Long customerId;
    private Long foodId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    private String text;
    private Integer score;

    // Getter & Setter
    public Long getReviewId() { return reviewId; }
    public void setReviewId(Long reviewId) { this.reviewId = reviewId; }

    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public Long getFoodId() { return foodId; }
    public void setFoodId(Long foodId) { this.foodId = foodId; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public Integer getScore() { return score; }
    public void setScore(Integer score) { this.score = score; }
}

