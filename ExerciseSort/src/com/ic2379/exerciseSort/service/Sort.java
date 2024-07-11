//por jceloto7

package com.ic2379.exerciseSort.service;

import com.ic2379.exerciseSort.model.Student;

import java.util.LinkedList;


public class Sort extends AbstractSortableList<Student> {

    public Sort(){
        this.list= new LinkedList<Student>();
    }

    public void sortList(){
        this.list.sort(null);
    }


}
