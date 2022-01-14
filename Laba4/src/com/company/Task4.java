package com.company;
import java.util.Scanner;
import java.lang.String;

import java.util.Arrays;

public class Task4 {

    static int minspaces = 999999999;
    static int minSpacesLineIndex = -1;

    public static void Spaces(String[] input, int NumStr, int spaceCount) {
        //int minspaces = spaceCount;
        if(spaceCount<minspaces)
        {
            minspaces = spaceCount;

            minSpacesLineIndex = NumStr;
        }

    }




        public static void main (String[]args){
            System.out.print("Задайте размер массива: ");
            Scanner sc = new Scanner(System.in);
            int arraylength = Integer.parseInt(sc.nextLine());
            System.out.println("Введите ваши предложения: ");

            String[] input = new String[arraylength];
            for (int i = 0; i < input.length; i++) {
                input[i] = sc.nextLine();
            }
            System.out.println("Введит строку, ко которую вы хотите найти: ");
            String substring = sc.nextLine();

//        System.out.println(Arrays.toString(input));
            for (String word : input
            ) {
                int index = -1;
                if (word.toLowerCase().contains(substring.toLowerCase())) {
                    System.out.println("Строка, которая содержит слово (" +substring+"): " +word);

                    for (int i = 0; (i < input.length) && (index == -1); i++) {
                        if (input[i].equals(word)) {
                            index = i + 1;
                        }

                    }

                }


                int spaceCount = 0;
                for (char c : word.toCharArray()) {
                    if (c == ' ') {
                        spaceCount++;
                    }

                }

                Spaces(input,index,spaceCount);

            }

            System.out.println("Мин кол-во пробелов "+minspaces);
            System.out.print("На строке "+minSpacesLineIndex);

        }

        }

