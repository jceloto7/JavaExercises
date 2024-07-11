package com.jceloto7.learning_heritage.util;

import com.jceloto7.learning_heritage.interfaces.Merchantable;

public class Service implements Merchantable {
    @Override
    public double calculateSell() {
        int servicePrice = 10;
        int quantityMonths=12;
        double deductions = 19.50;

        return (servicePrice*quantityMonths)-deductions;
    }
}
