package org.erfan.maeve.service.impl;

import org.erfan.maeve.entity.Order;
import org.erfan.maeve.entity.OrderStatus;
import org.erfan.maeve.repository.OrderRepository;
import org.erfan.maeve.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends BaseService<Order, Long> {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    protected OrderRepository getRepository() {
        return orderRepository;
    }

    public Order updateStatus(Long orderId, OrderStatus status) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        order.setOrderStatus(status);
        return orderRepository.save(order);
    }
}

