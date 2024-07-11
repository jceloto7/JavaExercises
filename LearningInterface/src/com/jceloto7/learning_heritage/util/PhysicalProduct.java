package com.jceloto7.learning_heritage.util;

import com.jceloto7.learning_heritage.interfaces.Calculable;

public class PhysicalProduct implements Calculable {
    double serviceTax = 4.50;
    @Override
    public double calculateFinalPrice() {
        int delivery;
        int ProductPrice;;
        double finalPrice;

        delivery =1;
        ProductPrice =40;
        finalPrice=delivery+ProductPrice+serviceTax;
        return finalPrice;
    }
}
