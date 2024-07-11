package com.jceloto7.learning_heritage.util;

import com.jceloto7.learning_heritage.interfaces.FinancialConverter;

public class CoinCoverter implements FinancialConverter {
    double dolar;
    @Override
    public double dolarToReal() {
        double real;
        real=dolar*5.24;
        return real;
    }
}
