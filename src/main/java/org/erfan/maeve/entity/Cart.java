package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import java.util.List;

@Entity
@Table(name = "cart")
@SQLDelete(sql = "UPDATE cart SET is_active = false WHERE cart_id = ?")
@Where(clause = "is_active = true")
public class Cart extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    private Long customerId;

    // Getter & Setter
    public Long getCartId() { return cartId; }
    public void setCartId(Long cartId) { this.cartId = cartId; }

    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }
}

