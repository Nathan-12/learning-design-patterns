package com.estudos.strategy.context;

import com.estudos.strategy.interfaceStrategy.PaymentStrategy;

import java.math.BigDecimal;

public class Order {

    private BigDecimal value;

    public Order(BigDecimal value) {
        this.value = value;
    }

    public void processPayment(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(value);
    }

    public void refundPayment(PaymentStrategy paymentStrategy) {
        paymentStrategy.refund(value);
    }
}
