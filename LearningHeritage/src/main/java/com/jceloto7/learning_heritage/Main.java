package com.jceloto7.learning_heritage;

import com.jceloto7.learning_heritage.view.CommandView;

public class Main {
    public static void main(String[] args) {
        CommandView commandView = new CommandView();
        Bootstrap.start();

        commandView.mainMenu();
    }
}