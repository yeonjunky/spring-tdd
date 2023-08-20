package com.orderservice.orderservice.payment;

import com.orderservice.orderservice.order.Order;

interface PaymentPort {
    Order getOrder(Long orderId);

    void save(Payment payment);

    void pay(int price, String cardNumber);
}
