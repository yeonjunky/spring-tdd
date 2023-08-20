package com.orderservice.orderservice.order;

import com.orderservice.orderservice.ApiTest;
import com.orderservice.orderservice.order.application.service.CreateOrderRequest;
import com.orderservice.orderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class OrderApiTest extends ApiTest {

    @Test
    void 상품주문() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        final CreateOrderRequest request = OrderSteps.상품주문요청_생성();

        final var response = OrderSteps.상품주문요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }
}
