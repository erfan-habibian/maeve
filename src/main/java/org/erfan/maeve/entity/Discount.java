package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import java.util.Date;

@Entity
@Table(name = "discount")
@SQLDelete(sql = "UPDATE discount SET is_active = false WHERE discount_id = ?")
@Where(clause = "is_active = true")
public class Discount extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long discountId;

    private String code;
    private String description;
    private Integer percentage;
    private Boolean isValid;

    @Temporal(TemporalType.TIMESTAMP)
    private Date validUntil;

    // Getter & Setter
    public Long getDiscountId() { return discountId; }
    public void setDiscountId(Long discountId) { this.discountId = discountId; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Integer getPercentage() { return percentage; }
    public void setPercentage(Integer percentage) { this.percentage = percentage; }

    public Boolean getIsValid() { return isValid; }
    public void setIsValid(Boolean isValid) { this.isValid = isValid; }

    public Date getValidUntil() { return validUntil; }
    public void setValidUntil(Date validUntil) { this.validUntil = validUntil; }
}

