package com.ic2379.exerciseSort.test;

import com.ic2379.exerciseSort.bootstrap.Bootstrap;
import com.ic2379.exerciseSort.service.AbstractSortableList;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Test<T> {
    private static final String GET_NAME_METHOD = "getName";
    private static final String GET_GRADE_METHOD = "getGrade";
    private static final String SET_NAME_METHOD = "setName";
    private static final String SET_GRADE_METHOD = "setGrade";

    private static final int[] GRADES = {5, 7, 9, 10, 2, 3, 4, 1, 1, 0, 4, 8, 0};

    private static final String[] STUDENTS = {"Gabriel", "Amanda", "Adryen", "Jessica", "Eduardo", "Felipe",
            "Monica", "Gabriela", "Gustavo", "Mirella", "Marcio", "Beatriz", "Lucas"};

    private Map<Integer, Map<String, Integer>> correctOrder;
    public boolean sendTest(AbstractSortableList<T> sortableList){
        loadCorrectOrder();
        Class<?> tClass = (Class<?>)Bootstrap.getService("class");
        if(!verifyTClass(tClass)) return false;

        try{
            Method getName = tClass.getMethod(GET_NAME_METHOD);
            Method setName = tClass.getMethod(SET_NAME_METHOD, String.class);
            Method getGrade = tClass.getMethod(GET_GRADE_METHOD);
            Method setGrade = tClass.getMethod(SET_GRADE_METHOD, int.class);

            for(int i = 0; i < 13; i++){
                T instance = (T)tClass.newInstance();
                setName.invoke(instance, STUDENTS[i]);
                setGrade.invoke(instance, GRADES[i]);

                sortableList.add(instance);
            }

            sortableList.sortList();

            boolean pass = true;
            int position = 0;
            for(var item : sortableList.getList()){
                for(var student : correctOrder.get(position).entrySet()){
                    if(!student.getKey().equals(getName.invoke(item))) pass = false;
                    if(!student.getValue().equals(getGrade.invoke(item))) pass = false;
                }

                position++;
            }

            if(!pass) System.err.println("Ordem errada");

            return pass;
        }catch (NoSuchMethodException nEx){
            System.err.println("Metodos set com argumentos invalidos");
            return false;
        }
        catch (Exception ex){
            return false;
        }
    }

    public boolean verifyTClass(Class<?> tClass){
        boolean hasGetName = false;
        boolean hasGetGrade = false;
        boolean hasSetName = false;
        boolean hasSetGrade = false;

        if(tClass == null) return false;

        Method[] methods = tClass.getMethods();
        for(var method : methods){
            if(GET_NAME_METHOD.equals(method.getName())) hasGetName = true;
            if(GET_GRADE_METHOD.equals(method.getName())) hasGetGrade = true;
            if(SET_NAME_METHOD.equals(method.getName())) hasSetName = true;
            if(SET_GRADE_METHOD.equals(method.getName())) hasSetGrade = true;
        }

        if(!hasGetName){
            System.out.println("Don't have get Name method");
            return false;
        }
        if(!hasGetGrade){
            System.out.println("Don't have get Grade method");
            return false;
        }
        if(!hasSetName){
            System.out.println("Don't have set Name method");
            return false;
        }
        if(!hasSetGrade){
            System.out.println("Don't have set Grade method");
            return false;
        }

        return true;
    }

    private void loadCorrectOrder(){
        correctOrder = new HashMap<>();
        int[] grades = {10, 9, 8, 7, 5, 4, 4, 3, 2, 1, 1, 0, 0};
        String[] students = {"Jessica", "Adryen", "Beatriz", "Amanda", "Gabriel", "Marcio", "Monica",
                "Felipe", "Eduardo", "Gabriela", "Gustavo", "Lucas", "Mirella"};

        for(int i = 0; i < 13; i++){
            Map<String, Integer> newMap = new HashMap<>();
            newMap.put(students[i], grades[i]);
            correctOrder.put(i, newMap);
        }
    }

    //private static final int[] GRADES = {5, 7, 9, 10, 2, 3, 4, 1, 1, 0, 4, 8, 0};
    //private static final String[] STUDENTS = {"Gabriel", "Amanda", "Adryen", "Jessica", "Eduardo", "Felipe",
    //        "Monica", "Gabriela", "Gustavo", "Mirella", "Marcio", "Beatriz", "Lucas"};
}
