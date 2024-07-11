package com.jceloto7.learning_heritage.controller;

import com.jceloto7.learning_heritage.service.GetOSService;

public class GetOSController {

    private final GetOSService getOSService;

    public GetOSController(GetOSService getOSService){
        this.getOSService = getOSService;
    }

    public String commandImpl(){
        try {
            return getOSService.runCommand();
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
            return "";
        }
    }
}
