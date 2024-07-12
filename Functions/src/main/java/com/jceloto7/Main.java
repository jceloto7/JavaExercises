package com.jceloto7;

//testando o git

import com.jceloto7.model.Product;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Product notebook = new Product("notebook", 2000.75, 0.2);
        Product PCGamer = new Product("pc gamer",10000,0.1);

        BinaryOperator<Double> multiplication = (x, y) -> (x * y);
        BinaryOperator<Double> subtraction=(x,y) -> (x-y);
        BinaryOperator<Double> addition=(x,y) -> (x+y);
        UnaryOperator<Double> tax = (x) -> (x>=2500 ? x*0.085 :0);
        UnaryOperator<Double> freight = (x) -> (x>=3000 ? 100.0 : 50.0);


        Consumer<Product> finalRealPrice = product ->{
            Double discountResult= multiplication.apply(product.getPrice(), product.getDiscount());
            Double finalPrice=subtraction.apply(product.getPrice(), discountResult);
            Double priceTax = tax.apply(finalPrice);
            Double finalTax = addition.apply(finalPrice, priceTax);
            Double priceFreight = freight.apply(finalTax);
            Double finalFreight = addition.apply(finalTax, priceFreight);
            System.out.printf("R$" + "%.2f%n",finalFreight);
        };

        finalRealPrice.accept(notebook);
        finalRealPrice.accept(PCGamer);

    }
}