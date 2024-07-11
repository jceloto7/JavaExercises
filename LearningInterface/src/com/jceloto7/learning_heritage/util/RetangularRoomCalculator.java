package com.jceloto7.learning_heritage.util;

import com.jceloto7.learning_heritage.interfaces.GeometricCalculator;

public class RetangularRoomCalculator implements GeometricCalculator {
    double width;
    double height;

    @Override
    public double areaCalculator() {
        double area;
        area=width*height;
        return area;
    }

    @Override
    public double perimeterCalculator() {
        double perimeter;
        perimeter=2*(width*height);
        return perimeter;
    }
}
