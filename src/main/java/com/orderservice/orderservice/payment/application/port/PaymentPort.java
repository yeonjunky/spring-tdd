package com.orderservice.orderservice.payment.application.port;

import com.orderservice.orderservice.order.domain.Order;
import com.orderservice.orderservice.payment.domain.Payment;

public interface PaymentPort {
    Order getOrder(Long orderId);

    void save(Payment payment);

    void pay(int price, String cardNumber);
}
