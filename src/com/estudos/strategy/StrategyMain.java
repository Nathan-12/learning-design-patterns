package com.estudos.strategy;

import com.estudos.strategy.context.Order;
import com.estudos.strategy.interfaceConcrete.PaymentCreditCard;
import com.estudos.strategy.interfaceConcrete.PaymentDebitCard;

import java.math.BigDecimal;

public class StrategyMain {
    public static void main(String[] args) {
        // Test Strategy Pattern
        BigDecimal valuePayment = new BigDecimal("30");
        Order order = new Order(valuePayment);
        order.processPayment(new PaymentCreditCard());
        order.processPayment(new PaymentDebitCard());

        BigDecimal refundPayment = new BigDecimal("10");
        Order orderRefund = new Order(refundPayment);
        orderRefund.refundPayment(new PaymentCreditCard());
        orderRefund.refundPayment(new PaymentDebitCard());
    }
}
