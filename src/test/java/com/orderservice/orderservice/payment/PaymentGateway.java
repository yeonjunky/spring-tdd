package com.orderservice.orderservice.payment;

interface PaymentGateway {
    void execute(int totalPrice, String cardNumber);
}
