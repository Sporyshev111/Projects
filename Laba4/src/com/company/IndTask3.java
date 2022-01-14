package com.company;
import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class IndTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше предложение: ");
        String text = sc.nextLine();
        String [] wordsarray = new String[text.length()];
        wordsarray = text.split(" ");
        for (String word:wordsarray
        ) {
            if (word.matches("\\W{1}\\d{3}\\W{1}\\d{3}\\W*\\d{2}\\W*\\d{2}"))
            {
                System.out.println(word);
            }

        }
    }
}
