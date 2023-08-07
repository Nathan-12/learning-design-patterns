package com.estudos.strategy.interfaceConcrete;

import com.estudos.strategy.interfaceStrategy.PaymentStrategy;

import java.math.BigDecimal;

public class PaymentCreditCard implements PaymentStrategy {

    @Override
    public void pay(BigDecimal value) {
        BigDecimal creditTax = new BigDecimal("0.03"); //credit tax

        BigDecimal result = value.multiply(creditTax); //credit tax * value

        System.out.println("Credit card payment: " + result.add(value) + ".\n"
        + "Tax aplication: " + creditTax + ".\n");
    }
}
