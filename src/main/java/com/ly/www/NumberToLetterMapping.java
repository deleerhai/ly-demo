package com.ly.www;

import java.util.Map;

/**
 * @Title
 * @Auther liuyang
 * @Date 2021-02-23 20:15:10
 */
public class NumberToLetterMapping {

    private static final String[] two = {"A", "B", "C"};

    private static final String[] three = {"D", "E", "F"};

    private static final String[] four = {"G", "H", "I"};

    private static final String[] five = {"J", "K", "L"};

    private static final String[] six = {"M", "N", "O"};

    private static final String[] seven = {"P", "Q", "R", "S"};

    private static final String[] eight = {"T", "U", "V"};

    private static final String[] nine = {"W", "X", "Y", "Z"};


    public static String[] toLetter(int number){
        switch (number){
            case 2:
                return two;
            case 3:
                return three;
            case 4:
                return four;
            case 5:
                return five;
            case 6:
                return six;
            case 7:
                return seven;
            case 8:
                return eight;
            case 9:
                return nine;
            default:
                return null;
        }
    }

}
