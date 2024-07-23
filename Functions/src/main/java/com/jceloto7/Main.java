package com.jceloto7;

import com.jceloto7.model.Product;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Product notebook = new Product("notebook", 2000.75, 0.2);
        Product pcGamer = new Product("pc gamer", 10000, 0.1);

        Function<Product, Double> priceWithDiscount = product -> product.getPrice() * (1 - product.getDiscount());
        UnaryOperator<Double> priceWithTax = price -> (price >= 2500 ? price * 1.085 : price);
        UnaryOperator<Double> priceWithFreight = price -> (price >= 3000 ? price + 100.0 : price + 50.0);
        Function<Double,String> roundedPrice = price -> String.format("%.2f", price);
        UnaryOperator<String> priceView = price -> ("R$" + price).replace(".",",");

        Function<Product, String> product = priceWithDiscount
                .andThen(priceWithTax)
                .andThen(priceWithFreight)
                .andThen(roundedPrice)
                .andThen(priceView);

        System.out.println(product.apply(notebook));
        System.out.println(product.apply(pcGamer));
    }
}




