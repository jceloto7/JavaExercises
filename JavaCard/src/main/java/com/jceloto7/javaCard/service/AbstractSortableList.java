package com.jceloto7.javaCard.service;

import java.util.List;

public abstract class AbstractSortableList<T> {
    protected List<T> list;

    public abstract void sortList();

    public void add(T value){
        this.list.add(value);
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
