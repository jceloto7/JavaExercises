package com.jceloto7.javaCard.model;

public class Purchase implements Comparable<Purchase> {
    String name;
    double value;

    public Purchase(String name,double value){
        this.name =name;
        this.value = value;
    }

    public Purchase(){

    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }



    @Override
    public int compareTo(Purchase purchase) {
        int valueComparison = Double.compare(this.getValue(), purchase.getValue());
        if (valueComparison !=0){
            return valueComparison;
        }else{
            return this.getName().compareTo(purchase.getName());
        }
    }
    @Override
    public String toString() {
        return  name + ": " + value + "\n";
    }

    public Purchase createPurchase(String name, double value){
        return new Purchase(name,value);
    }

}
