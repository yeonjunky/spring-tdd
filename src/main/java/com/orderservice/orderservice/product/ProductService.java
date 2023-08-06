package com.orderservice.orderservice.product;

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