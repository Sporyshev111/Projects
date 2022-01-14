package com.company;
import java.util.Scanner;

import java.lang.String;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пример:");
        String task = scanner.nextLine();
        for (String str : task.split(" ")
        ) {
            char operation;
            int num;
            if (str.matches("\\D?\\d+")) {

                num = Integer.parseInt(str);
                System.out.println(num);


            }
            if (str.matches("\\D{1}")) {

                for (int i = 0; i < str.length(); i++) {
                    operation = str.charAt(i);
                    System.out.println(operation);
                }

            }
        }
    }
}