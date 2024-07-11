package com.jceloto7.learning_heritage.util;

import com.jceloto7.learning_heritage.interfaces.MultiplicationTable;

public class MultiplicationTableCalculator implements MultiplicationTable {
    int number =7;

    @Override
    public void showMultiplicationTable() {
        for(int i=1;i<=9;i++){
            System.out.println(number*i);
        }
    }
}
