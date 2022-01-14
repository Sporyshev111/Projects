package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10000: ");
    int num = scanner.nextInt();
    if(num>0 && num < 10000)
    {
        System.out.println("Все четные делители числа "+num);
        for(int i=2;i<=num; i++)
            if(num%i==0){
                System.out.println(i);
            }

    }else {
        System.out.println("Введите число от 1 до 10000!!!");
    }
    }
}
