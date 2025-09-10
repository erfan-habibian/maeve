package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "ordered_food")
@SQLDelete(sql = "UPDATE ordered_food SET is_active = false WHERE ordered_food_id = ?")
@Where(clause = "is_active = true")
public class OrderedFood extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderedFoodId;

    private Long cartId;
    private Long foodId;
    private Integer number;
    private String extraInformation;

    // Getter & Setter
    public Long getOrderedFoodId() { return orderedFoodId; }
    public void setOrderedFoodId(Long orderedFoodId) { this.orderedFoodId = orderedFoodId; }

    public Long getCartId() { return cartId; }
    public void setCartId(Long cartId) { this.cartId = cartId; }

    public Long getFoodId() { return foodId; }
    public void setFoodId(Long foodId) { this.foodId = foodId; }

    public Integer getNumber() { return number; }
    public void setNumber(Integer number) { this.number = number; }

    public String getExtraInformation() { return extraInformation; }
    public void setExtraInformation(String extraInformation) { this.extraInformation = extraInformation; }
}

