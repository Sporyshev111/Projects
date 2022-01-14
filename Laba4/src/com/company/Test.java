package com.company;
import java.util.*;


import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Test {
    static int _i = 0;
    static int _j = 0;
    static int[] arrofseconds = new int[10];
    private static String ArrayUtils;


    public static void NearestValue(int []arrofseconds){
        int min = 99;
        for (int i = 0; i < arrofseconds.length-1; i++) {
            for (int j = 1; j < arrofseconds.length-1; j++) {
                if(Math.abs(arrofseconds[i]-arrofseconds[j])<min)
                {
                    min = arrofseconds[i]-arrofseconds[j];

                    _i =i+1;
                    _j =j+1;
                    System.out.println("Минимум между треками "+Math.abs(min)+" с под индексами "+_i+" и "+_j);

                }
            }
        }

    }
    public static void main(String[] args) {
        System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int arraylength = Integer.parseInt(sc.nextLine());

        String[] input = new String[arraylength];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextLine();
        }

        for (String line:input
             ) {
            Pattern pattern = Pattern.compile("[0-5]{0,1}\\d(:)[0-5]{1}\\d");
            Matcher matcher = pattern.matcher(line);
            for (String word: line.split(" ")
                 ) {

//                if(word.matches("[0-5]{0,1}\\d(:)[0-5]{1}\\d"))
                if (matcher.find())
                {
                   String [] arroftime = line.substring(matcher.start(),matcher.end()).split(":");
                   int minutes = Integer.parseInt(arroftime[0])*60;
                    int seconds = Integer.parseInt(arroftime[1]);
                    seconds += minutes;
                    arrofseconds[_i]= seconds;
                    _i++;

                }
            }

        }

        int minimum = Arrays.stream(arrofseconds).min().getAsInt();
        int maximum = Arrays.stream(arrofseconds).max().getAsInt();
        int indexofmin = Arrays.stream(arrofseconds).boxed().collect(Collectors.toList()).indexOf(minimum);
//Мы получим IntStream, вставляем его в Stream<Integer>, собераем его до List<Integer> и затем выполняем поиск .indexOf().
        int indexofmax = Arrays.stream(arrofseconds).boxed().collect(Collectors.toList()).indexOf(maximum);
        System.out.println("Самый короткий трек "+minimum+" под индексом "+(indexofmin+1));
        System.out.println("Самый длинный трек "+maximum+" под индексом "+(indexofmax+1));

   NearestValue(arrofseconds);


    }


}

