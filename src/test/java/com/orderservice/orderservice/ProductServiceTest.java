package com.orderservice.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.orderservice.orderservice.product.AddProductRequest;
import com.orderservice.orderservice.product.DiscountPolicy;
import com.orderservice.orderservice.product.ProductService;


@SpringBootTest
class ProductServiceTest {
    
    @Autowired
    private ProductService productService;

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