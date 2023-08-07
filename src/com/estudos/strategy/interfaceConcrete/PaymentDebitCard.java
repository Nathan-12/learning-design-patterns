package com.estudos.strategy.interfaceConcrete;

import com.estudos.strategy.interfaceStrategy.PaymentStrategy;

import java.math.BigDecimal;

public class PaymentDebitCard implements PaymentStrategy {

    @Override
    public void pay(BigDecimal value) {
        BigDecimal debitTax = new BigDecimal("0.02"); //debit tax

        BigDecimal result = value.multiply(debitTax); //debit tax * value

        System.out.println("Debit card payment: " + result.add(value) + ".\n"
                + "Tax aplication: " + debitTax + ".\n");
    }
}
