package com.jceloto7.learning_heritage.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PingService extends Command {
    @Override
    protected String commandImpl() {
        String ipAddress = "8.8.8.8";
        int linesToPrint = 5;
        try {
            Process pingCommand = Runtime.getRuntime().exec("ping " + ipAddress);

            BufferedReader reader = new BufferedReader(new InputStreamReader(pingCommand.getInputStream()));
            String pingAnswer;
            int linesPrinted =0;
            while ((pingAnswer = reader.readLine()) != null && linesPrinted <linesToPrint) {
                System.out.println(pingAnswer);
                linesPrinted++;
            }
            return pingAnswer;
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }

        return "";

    }

}