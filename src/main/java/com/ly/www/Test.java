package com.ly.www;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Title
 * @Auther liuyang
 * @Date 2021-02-23 20:08:14
 */
public class Test {


    public static void main(String[] args){
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        convert(numbers);
    }



    public static void convert(int[] numbers){
        if(numbers == null || numbers.length == 0) return;

        List<String> list = new ArrayList<String>();

        int i = 0;
        do{
            int number = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                int nextNumber = numbers[j];
                List<String> strs = combination(number, nextNumber);
                if(Objects.isNull(strs)) continue;
                list.addAll(strs);
            }
            i++;
        }while (i < numbers.length);

        System.out.println(list);
    }

    private static List<String> combination(int number, int nextNumber){
        String[] firstLetters = NumberToLetterMapping.toLetter(number);
        String[] lastLetters = NumberToLetterMapping.toLetter(nextNumber);

        if(firstLetters == null || lastLetters == null) return null;

        List<String> strs = new ArrayList<String>();
        for(String firstLetter : firstLetters){
            for(String lastLetter : lastLetters){
                strs.add(firstLetter + lastLetter);
            }
        }
        return strs;
    }

}
