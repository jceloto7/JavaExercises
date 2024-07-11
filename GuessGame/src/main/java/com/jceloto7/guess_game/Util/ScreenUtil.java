package com.jceloto7.guess_game.Util;

public class ScreenUtil {

    public static final String GAME_INSTRUCTIONS = """
                                       GUESS NUMBER GAME RULES
                                       
                Please, read with attention.
                
                In this game the computer will generate a random integer number from 0 to 100
                and you will have five tries to guess this number. In each wrong try, the computer
                will tell you if the number you chose is bigger or smaller than the generated number.
                
                Easy, don't you think?
                
                Good Luck! ^^""";


    public void gameTries(int tries){
        if (tries ==1){
            System.out.println("""
                    The number has been generated.
                    
                                  Try""" + " " + tries + """
                    
                    Please type one integer number from 0 to 100:""");
        }else if(tries >1 && tries <5){
            System.out.println("""
                                 Try"""+ " " + tries + """
                                       
                    Please type one integer number:""");
        }else {
            System.out.println( """
                               Try 5
                    WARNING: This is your last shot to guess the number.
                    Please type one integer number:""");

        }
    }

}
