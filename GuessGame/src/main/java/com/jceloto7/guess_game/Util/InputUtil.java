package com.jceloto7.guess_game.Util;

import java.util.Scanner;

public class InputUtil {
    private final Scanner scanner;

    public InputUtil(){
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        String number;
        number = scanner.next();
        return number;
    }
    public void closeScanner(){
        scanner.close();
    }



}

