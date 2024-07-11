package com.jceloto7.javaCard.service;

import com.jceloto7.javaCard.model.Purchase;

import java.util.LinkedList;

public class Sort extends AbstractSortableList<Purchase> {

    public Sort(){
        this.list = new LinkedList<>();
    }

    public void sortList(){
        this.list.sort(null);
    }

    public void showList() {
        System.out.println("Your purchases: \n");
        for(Purchase element:list){
            System.out.println(element);
        }
    }

    public double totalValues(){
        double total =0;
        for(Purchase element:list){
            total += element.getValue();
        }
        return total;
    }
}
