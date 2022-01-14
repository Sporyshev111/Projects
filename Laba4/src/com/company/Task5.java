package com.company;
 import java.util.Scanner;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Scanner;
 import java.lang.String;


public class Task5 {
    public static void RegEx(String [] words) {
        for (String word : words
        ) {

            boolean result = word.matches("\\b[A-Z]{1}[a-zA-Z]*\\d{2}");
            if (result) {
                System.out.println("Подходящий никнейм: "+word);
            }
            else {
                System.out.println("Измените эти никнеймы: "+ word);
            }

        }
    }
    public static void main(String[] args) {

//        String input = "+12343454556";
//        boolean result = input.matches("(\\+*)\\d{11}");
//        if(result){
//            System.out.println("It is a phone number");
//        }
//        else{
//            System.out.println("It is not a phone number!");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите никнеймы: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        RegEx(words);
//        for (String word : words
//        ) {
//
//            boolean result = word.matches("\\b[A-Z]{1}[a-zA-Z]*\\d{2}");
//            if(result){
//            System.out.println(word);
//        }


//        }


//        boolean result = str.matches("\\b[A-Z]{1}[a-zA-Z]*\\d{2}");
//        if(result){
//            System.out.println(str);
//        }





    }
}

