package com.pb.petrychenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[10]; //создаем  массив размером 10
        for (int i = 0; i < mas.length; i++)
            mas[i] = scan.nextInt(); // заполняем массив с клавиатуры

            System.out.println("Заполненый массив");
            for (int i=0;i < mas.length;i++)
                System.out.print(mas[i] + " ");// Выводим заполненый массив на экран

        int result = 0;
        for (int i = 0; i < mas.length; i++) {

            result = result + mas[i];
            System.out.println("Сумма элементов массива равна: " + result);

        }
        int count = 0;
        for (int i=0;i < mas.length; i++) {
            if (mas[i] > 0)
                count=count+mas[i];
            System.out.println("Сумма положительных элементов массива равна: "+ count);
        }

        int temp;
        boolean sorted = false;
        while (sorted)
            sorted= true;
            for (int i=0;i < mas.length; i++) {
                if (mas[i] >mas[i+1]) {
                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                    sorted = false;
                }
                System.out.println("Выводим отсортированный массив на экран: "+ mas[i]);

            }
    }
}
