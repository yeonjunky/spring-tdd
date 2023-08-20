package com.orderservice.orderservice.product.adapter;

import com.orderservice.orderservice.product.application.port.ProductPort;
import com.orderservice.orderservice.product.domain.Product;
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

    @Override
    public Product getProduct(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다."));
    }
}
