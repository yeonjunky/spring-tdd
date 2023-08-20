package com.orderservice.orderservice.payment.adapter;

interface PaymentGateway {
    void execute(int totalPrice, String cardNumber);
}
