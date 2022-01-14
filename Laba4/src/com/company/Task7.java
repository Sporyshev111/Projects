package com.company;
import java.util.Scanner;


import java.lang.String;


public class Task7 {
static int _i =0;
static int _j = 0;
static int minutes = 0;
static int [] arrofminutes = new int [10];
static int seconds = 0;
static int [] arrofseconds = new int [10];
public static void MinTimeFrame(int [] arrofseconds)
{
int min = arrofseconds[0];
    for (int i = 0; i < arrofseconds.length; i++) {
        if(arrofseconds[i] < min && arrofseconds[i] != 0){
            min = arrofseconds[i];
            _i = i;
        }
    }
    System.out.println("Самый короткий трек "+ min+" с под индексом "+(_i-1));
}
public static void Summofarrays (int [] arrofminutes,int [] arrofseconds, int length)
{
    for (int i = 0; i < length; i++) {
        arrofseconds[i] += arrofminutes[i];
    }
}

public static void Mintosec (int minutes, int [] arrofminutes, int length)
{
    int seconds = minutes*60;
    for (int i = 0; i < length; i++) {
        arrofminutes[_i] = seconds;

    }
    _i++;

}
    public static void Seconds (int seconds, int [] arrofseconds, int length)
    {

        for (int i = 0; i < length; i++) {
            arrofseconds[_j] = seconds;

        }
        _j++;

    }



    public static void main(String[] args) {
        System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int arraylength = Integer.parseInt(sc.nextLine());

        String[] input = new String[arraylength];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextLine();
        }
        for (String word : input
        ) {
            for (String str : word.split("\\W")
            ) {

                if (str.matches("\\d+")) {



                        minutes = Integer.parseInt(str);
                        Mintosec(minutes,arrofminutes, arraylength);
                        break;


// MintoSec(timeframe);


//                    TimeTrack(timeframe, str.length());
//                    for (String num : str.split("")
//                    ) {
//for (int i = 0; i < 1; i++)
//{  int timeframe = Integer.parseInt(str);
//
//
//    TimeTrack(timeframe, str.length());
//}
//
                    }



                }
            }
        for (String word : input
        ) {
            for (String str : word.split("\\W")
            ) {

                if (str.matches("\\d{2}")) {



                     seconds = Integer.parseInt(str);

Seconds(seconds,arrofseconds,arraylength);

//                    MintoSec(seconds);
//


// MintoSec(timeframe);


//                    TimeTrack(timeframe, str.length());
//                    for (String num : str.split("")
//                    ) {
//for (int i = 0; i < 1; i++)
//{  int timeframe = Integer.parseInt(str);
//
//
//    TimeTrack(timeframe, str.length());
//}
//
                }



            }
        }
        Summofarrays(arrofminutes, arrofseconds, arraylength);
        MinTimeFrame(arrofseconds);


        }
    }
