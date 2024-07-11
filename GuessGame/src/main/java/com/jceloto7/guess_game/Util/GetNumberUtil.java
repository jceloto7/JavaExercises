package com.jceloto7.guess_game.Util;

import java.util.Random;

public class GetNumberUtil {

    public int getNumber(){
        int guessGameNumber;

        guessGameNumber = new Random().nextInt(100);
        return guessGameNumber;
    }
}
