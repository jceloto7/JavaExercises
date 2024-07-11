package com.jceloto7.learning_heritage.service;

public class GetOSService extends Command {
        @Override
        protected String commandImpl() {
            String osName = System.getProperty("os.name");
            return "Operational System : " + osName;
        }
    }



