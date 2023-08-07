package com.orderservice.orderservice.product;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductService {
    private final ProductPort productPort;

    public ProductService(final ProductPort productport) {
        this.productPort = productport;
    }

    public void addProduct(final AddProductRequest request) {
        final Product product = new Product(request.name(), request.price(), request.discountPolicy());

        this.productPort.save(product);
    }

}