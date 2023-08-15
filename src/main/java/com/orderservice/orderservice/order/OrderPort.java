package com.orderservice.orderservice.order;

import com.orderservice.orderservice.product.Product;

public interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);

}
