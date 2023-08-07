package com.orderservice.orderservice.product;

import org.springframework.stereotype.Component;

@Component
public class ProductAdapter implements ProductPort {
    final private ProductRepository productRepository;

    public ProductAdapter(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(final Product product) {
        productRepository.save(product);
    }
}
