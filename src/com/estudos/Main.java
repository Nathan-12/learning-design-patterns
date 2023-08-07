package com.estudos;

import com.estudos.strategy.context.Order;
import com.estudos.strategy.interfaceConcrete.PaymentCreditCard;
import com.estudos.strategy.interfaceConcrete.PaymentDebitCard;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // Test Strategy Pattern
        BigDecimal valuePayment = new BigDecimal("30");
        Order order = new Order(valuePayment);
        order.processPayment(new PaymentCreditCard());
        order.processPayment(new PaymentDebitCard());
    }
}
