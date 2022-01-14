package com.company;

import java.util.Scanner;

public class Main {
    public enum Stroy {
        F, UG
    }


    public static class Geography {

        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String capital = scanner.nextLine();

        int popularity = Integer.parseInt(scanner.nextLine());
        String stroy = scanner.nextLine();


        public Geography(String gosudarstvo, String stoliza, int naselenie, String stroy) {

            this.country = gosudarstvo;
            this.capital = stoliza;
            this.popularity = naselenie;
            this.stroy = stroy;
        }

        public Geography() {

        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество географических объектов: ");

        int n = Integer.parseInt(scanner.nextLine());

        Geography[] countries = new Geography[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите данные страны: 1)Гос, 2)Стол, 3)Нас, 4)Строй");
            Geography g1 = new Geography();
            countries[i] = g1;

        }
        

        for (int i = 0; i < countries.length; i++) {
            switch (countries[i].stroy) {
                case "F": {
                    Stroy stroy = Stroy.F;
                    System.out.println("|\t" + countries[i].country + "\t|\t" + countries[i].capital + "\t|\t" + countries[i].popularity + "\t|\t" + stroy+"\t|");
                    break;
                }

                case "UG": {
                    Stroy stroy1 = Stroy.UG;
                    System.out.println("|\t"+countries[i].country + "\t|\t" + countries[i].capital + "\t|\t" + countries[i].popularity + "\t|\t" + stroy1+"\t|");
                    break;
                }
                default: {
                    System.out.println("Строя нет");
                }

            }


        }


    }
}
