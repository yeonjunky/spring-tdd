package com.orderservice.orderservice.order.application.port;

import com.orderservice.orderservice.order.domain.Order;
import com.orderservice.orderservice.product.domain.Product;

public interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);

}
