package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "cart_and_ordered_food")
@SQLDelete(sql = "UPDATE cart_and_ordered_food SET is_active = false WHERE cart_and_ordered_food_id = ?")
@Where(clause = "is_active = true")
public class CartAndOrderedFood extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartAndOrderedFoodId;

    private Long cartId;
    private Long orderedFoodId;

    // Getter & Setter
    public Long getCartAndOrderedFoodId() { return cartAndOrderedFoodId; }
    public void setCartAndOrderedFoodId(Long cartAndOrderedFoodId) { this.cartAndOrderedFoodId = cartAndOrderedFoodId; }

    public Long getCartId() { return cartId; }
    public void setCartId(Long cartId) { this.cartId = cartId; }

    public Long getOrderedFoodId() { return orderedFoodId; }
    public void setOrderedFoodId(Long orderedFoodId) { this.orderedFoodId = orderedFoodId; }
}

