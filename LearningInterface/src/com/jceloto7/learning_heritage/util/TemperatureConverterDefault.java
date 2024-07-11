package com.jceloto7.learning_heritage.util;

import com.jceloto7.learning_heritage.interfaces.TemperatureConverter;

public class TemperatureConverterDefault implements TemperatureConverter {

    @Override
    public void celsiusToFahrenheit() {
        double celsius =20;
        double fahrenheit;
        fahrenheit=(celsius*1.8)+32;
        System.out.println(fahrenheit);
    }

    @Override
    public void fahrenheitToCelsius() {
        double celsius;
        double fahrenheit=7;
        celsius=(fahrenheit-32)/1.8;
        System.out.println(celsius);
    }
}
