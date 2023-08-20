package com.orderservice.orderservice.product.application.port;

import com.orderservice.orderservice.product.domain.Product;

public interface ProductPort {
    void save(final Product product);

    Product getProduct(Long productId);
}
