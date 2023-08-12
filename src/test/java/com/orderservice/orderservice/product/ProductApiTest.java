package com.orderservice.orderservice.product;

import com.orderservice.orderservice.ApiTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;


class ProductApiTest extends ApiTest {

    @Autowired
    private ProductService productService;

    @Test
    void registerProduct() {
        final var request = ProductSteps.상품등록요청_생성();

        final var response = ProductSteps.상품등록요청(request);

        Assertions.assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

}