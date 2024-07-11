package com.jceloto7.learning_heritage.service;

public abstract class Command {

    public String runCommand(){
        return commandImpl();
    }
    protected abstract String commandImpl();

}

