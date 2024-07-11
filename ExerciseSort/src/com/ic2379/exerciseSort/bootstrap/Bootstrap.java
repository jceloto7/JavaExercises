package com.ic2379.exerciseSort.bootstrap;

import com.ic2379.exerciseSort.model.Student;
import com.ic2379.exerciseSort.service.Sort;
import com.ic2379.exerciseSort.test.Test;

import java.util.HashMap;
import java.util.Map;

public class Bootstrap {
    private static Map<String, Object> instances;

    //Substituir onde esta ClasseModel pela sua classe de modelo
    //Substituir SortableList pela sua classe que implementa AbstractSortableList
    public static void startup(){
        instances = new HashMap<>();
        instances.put("class", Student.class);
        instances.put("list", new Sort());
        instances.put("tester", new Test<Student>());
    }

    public static Object getService(String key){
        try{
            return instances.get(key);
        }catch (Exception ex){
            return null;
        }
    }
}
