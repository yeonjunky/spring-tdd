package com.orderservice.orderservice.product;

public interface ProductPort {
    void save(final Product product);

    Product getProduct(Long productId);
}
