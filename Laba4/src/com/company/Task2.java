package com.company;
import java.util.Scanner;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
static char [] arrofchar;
static char [] arrofbannedchar;
static int counter;
public static boolean iscontains(char charoftext, char [] arrofbannedchar)
{
    boolean contains = false;
    for (char c : arrofbannedchar) {
        if (c == charoftext) {
            contains = true;
            break;
        }
    }
    return contains;

}

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше предложение: ");
     String text = scanner.nextLine();
       arrofchar = text.toCharArray();
       String banned = "- ,.!";
       arrofbannedchar = banned.toCharArray();
       counter = 1;
       String donestring = "";
        for (int i = 0; i < arrofchar.length; i++) {


                if (iscontains(arrofchar[i], arrofbannedchar) && !iscontains(arrofchar[i - 1], arrofbannedchar)) {


                        donestring += "(" + counter + ")" + arrofchar[i];


                    counter++;

                } else
                    donestring += arrofchar[i];


        }


        System.out.println(donestring);
    }
}
