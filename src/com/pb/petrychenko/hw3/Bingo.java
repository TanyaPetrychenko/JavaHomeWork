package com.pb.petrychenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("начинаем игру?");
        System.out.println("для выхода напишите нет,если хотите поиграть да" );
        Scanner newScanner = new Scanner(System.in);
        String sign;
        sign = newScanner.next();
        switch (sign) {
           case "нет":
                System.out.println("(((поиграем в след раз");
             break;
           case "да":
                final int MAX_ATTEMPT = 100;
                int attempt = 0;
                int x = 100;
                int number2;
                int number = (int) (Math.random() * x);
                while (attempt < MAX_ATTEMPT) {
                   attempt++;
                   System.out.println("угадайте число от 0 до" + x);
                   number2 = newScanner.nextInt();
                   if (number2 > number) {
                       System.out.println("введите меньшее число");

                   } else if (number2 < number) {
                       System.out.println("введите большее число");

                       //if (number2.equals("exit")){

                   } else {
                       System.out.println("Угадали, вы молодцы" + attempt + "попытки!");
                       break;
                   }
               }
           }
        }

    }




