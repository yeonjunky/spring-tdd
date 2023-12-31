package com.orderservice.orderservice.order.adapter;

import com.orderservice.orderservice.order.domain.Order;
import com.orderservice.orderservice.order.application.port.OrderPort;
import com.orderservice.orderservice.product.domain.Product;
import com.orderservice.orderservice.product.adapter.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class OrderAdapter implements OrderPort {
    private final ProductRepository productRepository;

    private final OrderRepository orderRepository;

    public OrderAdapter(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public Product getProductById(final Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다."));
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }
}
