package com.company;

import java.util.Scanner;

public class IndTask2 {//переделать

    public static void Replace(String word) {
        if (word.matches("[A-Za-z]{1,6}")) {
            System.out.print(" ");
            for (char bigletter : word.toCharArray()
            ) {
                if (Character.isUpperCase(bigletter)) {
                    String sign = "_";
                    bigletter = sign.charAt(0);

                }
                System.out.print(bigletter);


            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше предложение: ");
        String text = sc.nextLine();
        String[] wordsarray = new String[text.length()];
        wordsarray = text.split(" ");
        for (String word : wordsarray
        ) {
            if (word.toCharArray().length < 6) {
                Replace(word);
            } else
                System.out.print(word);


        }


    }
}
