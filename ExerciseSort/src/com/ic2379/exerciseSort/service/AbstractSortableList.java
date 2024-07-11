package com.ic2379.exerciseSort.service;

import java.util.List;

public abstract class AbstractSortableList<T> {
    protected List<T> list;

    public abstract void sortList();

    public void add(T value){
        this.list.add(value);
    }

    public void remove(T value){
        this.list.remove(value);
    }

    public void remove(int index){
        this.list.remove(index);
    }

    public T get(int index){
        return this.list.get(index);
    }

    public List<T> getList(){
        return this.list;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("{");
        builder.append("\n");
        for(var item : list){
            builder.append(item.toString());
            builder.append("\n");
        }

        builder.append("}");
        return builder.toString();
    }
}
