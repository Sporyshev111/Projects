package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double first = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double second  = scanner.nextDouble();
        if(first >= 0 && second >= 0)
        {
            if(first-second >= 0)
            {
                if(first - second ==0)
                    System.out.println("Два числа равны");
                System.out.println("Квадратный корень меньшего числа = "+Math.sqrt(second));
            }else {
                System.out.println("Квадратный корень меньшего числа = "+Math.sqrt(first));
            }

        }else {
            System.out.println("Error");
        }


        scanner.close();
    }
}
