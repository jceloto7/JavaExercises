package com.jceloto7.learning_heritage.controller;

import com.jceloto7.learning_heritage.service.GetRouterIPService;

public class GetRouterIPController {

    private final GetRouterIPService getRouterIPService;

    public GetRouterIPController(GetRouterIPService getRouterIPService){
        this.getRouterIPService = getRouterIPService;
    }

    public String commandImpl(){
        try {
            return getRouterIPService.runCommand();
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
            return "";
        }
    }
}
