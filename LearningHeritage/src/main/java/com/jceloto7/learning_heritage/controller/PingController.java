package com.jceloto7.learning_heritage.controller;

import com.jceloto7.learning_heritage.service.PingService;

public class PingController {
    private final PingService pingService;

    public PingController(PingService pingService){
        this.pingService = pingService;
    }

    public String commandImpl(){
        try {
            return pingService.runCommand();
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
            return "";
        }
    }
}


