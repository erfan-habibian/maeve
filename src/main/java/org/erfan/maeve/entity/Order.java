package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import java.util.Date;

@Entity
@Table(name = "orders")
@SQLDelete(sql = "UPDATE orders SET is_active = false WHERE order_id = ?")
@Where(clause = "is_active = true")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Long cartId;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    private Float totalPrice;

    private Long discountId;

    // Getter & Setter
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public Long getCartId() { return cartId; }
    public void setCartId(Long cartId) { this.cartId = cartId; }

    public OrderStatus getOrderStatus() { return orderStatus; }
    public void setOrderStatus(OrderStatus orderStatus) { this.orderStatus = orderStatus; }

    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date date) { this.orderDate = date; }

    public Float getTotalPrice() { return totalPrice; }
    public void setTotalPrice(Float totalPrice) { this.totalPrice = totalPrice; }

    public Long getDiscountId() { return discountId; }
    public void setDiscountId(Long discountId) { this.discountId = discountId; }
}

