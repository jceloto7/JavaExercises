package com.jceloto7.guess_game.Util;

public class GameUtil {

    public boolean smallerOrBigger(int guessNumber, int gameNumber){
        return guessNumber > gameNumber;
    }


    public void game(){
        GetNumberUtil getNumberUtil = new GetNumberUtil();
        int guessNumber;
        int gameNumber;
        int tries =0;
        String guessNumberString;
        ValidationUtil validationUtil = new ValidationUtil(new InputUtil());
        double doubleNumber;
        int intNumber;
        guessNumber = 101;
        ScreenUtil screenUtil = new ScreenUtil();
        InputUtil inputUtil = new InputUtil();
        gameNumber = getNumberUtil.getNumber();
        boolean hint;

        while(guessNumber != gameNumber && tries <5){
           tries++;
           screenUtil.gameTries(tries);
           guessNumberString = inputUtil.getInput();
           doubleNumber = validationUtil.validationParsable(guessNumberString);
           intNumber = validationUtil.validationInt(doubleNumber);
           guessNumber = validationUtil.validationGame(intNumber);
           hint = smallerOrBigger(guessNumber,gameNumber);
           if(hint && tries<5){
               System.out.println("""
                         Wrong try :(
                         But, here's a hint: you typed a bigger number than the one
                         the system generated.""");

           }else if(guessNumber == gameNumber) {
               System.out.println("Congratulations! You won ^^");

           }else if(tries ==5 ){
               System.out.println("""
                        What a pity, you didn't guess.
                        The system generated the number""" + " " +  gameNumber );

           }else{
               System.out.println("""
                         Wrong try :(
                         But, here's a hint: you typed a smaller number than the one
                         the system generated.""");
           }
        }

    }
 }

