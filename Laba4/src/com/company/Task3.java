package com.company;
import java.lang.String;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String str = scanner.nextLine();
        String [] split_array = str.split(" ");

        for (int i = split_array.length - 1; i >= 0; i--) {
            System.out.print(split_array[i]+" ");
        }

//        for (String word:str.split(" ")
//             ) {
//            for (int i = 0; i<str.length(); i++)
//            {
//
//            }
//        }
    }
    }