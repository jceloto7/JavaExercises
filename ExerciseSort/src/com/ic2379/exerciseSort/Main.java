package com.ic2379.exerciseSort;

import com.ic2379.exerciseSort.bootstrap.Bootstrap;
import com.ic2379.exerciseSort.service.AbstractSortableList;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try{
            Bootstrap.startup();

            Object tester = Bootstrap.getService("tester");
            Object abstractList = Bootstrap.getService("list");

            Method sendMethod = tester.getClass().getMethod("sendTest", AbstractSortableList.class);

            if((boolean)sendMethod.invoke(tester, abstractList)) System.out.println("Parabens, voce passou!");
            else System.err.println("Sorry, voce reprovou, tente novamente!");
        }catch (Exception ex){
            System.err.println(ex.getMessage());
            System.err.println("Sorry, voce reprovou, tente novamente!");
        }
    }
}