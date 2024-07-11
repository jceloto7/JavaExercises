package com.jceloto7.guess_game.Util;

import org.apache.commons.lang3.math.NumberUtils;

public class ValidationUtil {
    private final InputUtil inputUtil;

    public ValidationUtil(InputUtil inputUtil){
        this.inputUtil = inputUtil;
    }
    public char validationCharOption(String stringOption){
        char[] charOption = stringOption.toCharArray();

        while (charOption.length > 1 || charOption[0] != '1' && charOption[0] != '2') {
            System.out.println("Invalid option.Please just type 1 or 2:");
            stringOption = inputUtil.getInput();
            charOption = stringOption.toCharArray();
        }
        return charOption[0];

    }

    public double validationParsable(String stringNumberGuess){
        boolean validation;
        double doubleNumber;

        validation = NumberUtils.isParsable(stringNumberGuess);
        while (!validation) {
            System.out.println("Invalid input.Please just type one number from 0 to 100.");
            stringNumberGuess = inputUtil.getInput();
            validation = NumberUtils.isParsable(stringNumberGuess);
        }
        doubleNumber = Double.parseDouble(stringNumberGuess);

        return doubleNumber;

    }

    public int validationInt(double doubleNumber){
        int intNumber;
        String stringNumberGuess;
        ValidationUtil validationUtil = new ValidationUtil(inputUtil);
        int intTest = (int) doubleNumber;

        double validation = doubleNumber - intTest;

        while(validation !=0){
            System.out.println("Invalid number. Please enter an integer one.");
            stringNumberGuess = inputUtil.getInput();
            doubleNumber = validationUtil.validationParsable(stringNumberGuess);
            intTest = (int) doubleNumber;
            validation = doubleNumber - intTest;
        }

        intNumber = (int) doubleNumber;
        return intNumber;

    }

    public int validationGame(int intNumber){
        ValidationUtil validationUtil = new ValidationUtil(inputUtil);
        double doubleNumber;
        String stringNumberGuess;

        while(intNumber <0 || intNumber >100){
            System.out.println("Invalid number.Please type one number from 0 to 100");
            stringNumberGuess = inputUtil.getInput();
            doubleNumber = validationUtil.validationParsable(stringNumberGuess);
            intNumber = validationUtil.validationInt(doubleNumber);
        }

        return  intNumber;
    }



    }




