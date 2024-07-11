package com.jceloto7.learning_heritage.util;

import com.jceloto7.learning_heritage.interfaces.Merchantable;

public class Product implements Merchantable {
    @Override
    public double calculateSell() {
        int productPrice =5;
        int quantity =2;
        double deduction = 1.50;

        return (productPrice*quantity)-deduction;
    }
}
