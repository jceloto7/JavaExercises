package com.jceloto7.learning_heritage.util;

import com.jceloto7.learning_heritage.interfaces.Calculable;

public class Book  implements Calculable {

    double serviceTax = 5.50;
    @Override
    public double calculateFinalPrice() {
        int delivery =10;
        int bookPrice=30;
        double finalPrice;

        finalPrice=delivery+bookPrice+serviceTax;
        return finalPrice;


    }
}
