package com.jceloto7.learning_heritage.service;

public class JavaVersionService extends Command {
    @Override
    protected String commandImpl() {
        String javaVersion = System.getProperty("java.version");
        return "Java Version: " + javaVersion;
    }

}
