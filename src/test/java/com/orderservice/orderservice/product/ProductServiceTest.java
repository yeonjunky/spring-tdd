package com.orderservice.orderservice.product;


import com.orderservice.orderservice.product.application.port.ProductPort;
import com.orderservice.orderservice.product.application.service.GetProductResponse;
import com.orderservice.orderservice.product.application.service.ProductService;
import com.orderservice.orderservice.product.application.service.UpdateProductRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductPort productPort;
    @Autowired
    private ProductService productService;

    @Test
    void 상품수정() {
        productService.addProduct(ProductSteps.상품등록요청_생성());
        final Long productId = 1L;
        final UpdateProductRequest request = ProductSteps.상품수정요청_생성();

        productService.updateProduct(productId, request);

        final ResponseEntity<GetProductResponse> response = productService.getProduct(productId);
        final GetProductResponse productResponse = response.getBody();
        assertThat(productResponse.name()).isEqualTo("상품수정");
        assertThat(productResponse.price()).isEqualTo(2000);

    }
}