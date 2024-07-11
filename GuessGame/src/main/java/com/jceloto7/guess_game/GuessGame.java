package com.jceloto7.guess_game;

import com.jceloto7.guess_game.Util.*;

public class GuessGame {
    public static void main(String[] args) {
        String stringOption;
        InputUtil inputUtil = new InputUtil();
        char charOption;
        ValidationUtil validationUtil = new ValidationUtil(inputUtil);
        ScreenUtil screenUtil = new ScreenUtil();
        GameUtil gameUtil = new GameUtil();

        try {
            System.out.println("""
                    Hello! Welcome to the Guess Game.
                    Do you want to read the instructions? Please type 1 to 'yes' or 2 to 'no'""");

            stringOption = inputUtil.getInput();
            charOption = validationUtil.validationCharOption(stringOption);
            if (charOption == '1') {
                String showInstructions;
                showInstructions = ScreenUtil.GAME_INSTRUCTIONS;
                System.out.println(showInstructions);
            }
            charOption ='1';
            while (charOption =='1') {
                gameUtil.game();
                System.out.println("""
                        Do you want to play again?
                        Please type 1 to 'yes' or 2 to 'no'.""");
                stringOption = inputUtil.getInput();
                charOption = validationUtil.validationCharOption(stringOption);
            }
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again");

        }

        inputUtil.closeScanner();
        System.out.println("""
                    Thanks for playing the Guess Game ^^
                    Bye.""");

    }
}