package com.estudos.strategy.interfaceStrategy;

import java.math.BigDecimal;

public interface PaymentStrategy {

    void pay(BigDecimal value);

    void refund(BigDecimal value);
}
