package com.jceloto7.javaCard.view;

import com.jceloto7.javaCard.Bootstrap;
import com.jceloto7.javaCard.model.Purchase;
import com.jceloto7.javaCard.service.Sort;
import com.jceloto7.javaCard.util.InputUtil;

import static java.lang.Double.*;

public class JavaCardView {

    public void menu(){
        double creditCard;
        String input;
        InputUtil inputUtil = Bootstrap.inputUtil;
        char[] option;
        String name;
        double value;
        double total;
        double creditCardBalance;
        Purchase purchase = new Purchase();
        Purchase element;
        Sort sort = new Sort();

        System.out.println("Welcome! Please type your credit card limit: ");
        input = inputUtil.getInput();
        creditCard = parseDouble(input);
        option = input.toCharArray();
        option[0] = '1';
        while(option[0] == '1' ){
            total= sort.totalValues();
            creditCardBalance = creditCard - total ;
            System.out.println("Please, type your purchase: ");
            name = inputUtil.getInput();
            System.out.println("Right! Now type the purchase value, please: ");
            input = inputUtil.getInput();
            value = parseDouble(input);
            if((total + value) > creditCard ) {
                System.out.println("Sorry you don't have balance.\n");
                sort.showList();
                System.out.println("Credit card limit: " + creditCardBalance + "\n");
                option[0] ='0';
            }
            else{
                System.out.println("Purchase realized!");
                element = purchase.createPurchase(name,value);
                sort.add(element);
                sort.sortList();
                System.out.println("Do you want to buy anything else? Please type 1 to continue or any other key to exit.");
                input= inputUtil.getInput();
                option =input.toCharArray();
            }

        }

        System.out.println("Thanks for using JavaCard :)");
        inputUtil.closeScanner();
    }

}
