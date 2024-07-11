package com.jceloto7.learning_heritage.controller;

import com.jceloto7.learning_heritage.service.JavaVersionService;

public class JavaVersionController {

    private final JavaVersionService javaVersionService;

    public JavaVersionController(JavaVersionService javaVersionService){
        this.javaVersionService = javaVersionService;
    }

    public String commandImpl(){
        try {
            return javaVersionService.runCommand();
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
            return "";
        }
    }
}
