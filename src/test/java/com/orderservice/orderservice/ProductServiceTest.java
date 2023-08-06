package com.orderservice.orderservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.orderservice.orderservice.product.AddProductRequest;
import com.orderservice.orderservice.product.DiscountPolicy;
import com.orderservice.orderservice.product.ProductAdapter;
import com.orderservice.orderservice.product.ProductPort;
import com.orderservice.orderservice.product.ProductRepository;
import com.orderservice.orderservice.product.ProductService;



class ProductServiceTest {
    private ProductService productService;
    private ProductPort productPort;
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
        productPort = new ProductAdapter(productRepository);
        productService = new ProductService(productPort);
    }

    @Test
    void registerProduct() {
        final AddProductRequest request = 상품등록요청_생성();

        productService.addProduct(request);
    }

    private static AddProductRequest 상품등록요청_생성() {
        final String name = "productname";
        final int price = 1000;
        final DiscountPolicy discountPolicy = DiscountPolicy.NONE;
        final AddProductRequest request = new AddProductRequest(name, price, discountPolicy);
        return request;
    }
}