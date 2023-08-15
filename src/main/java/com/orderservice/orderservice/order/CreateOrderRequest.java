package com.orderservice.orderservice.order;

import org.springframework.util.Assert;

public record CreateOrderRequest(Long productId, int quantity) {
    public CreateOrderRequest {
        Assert.notNull(productId, "상품 Id는 필수입니다.");
        Assert.isTrue(quantity > 0, "수량은 0보다 커야합니다.");
    }
}
