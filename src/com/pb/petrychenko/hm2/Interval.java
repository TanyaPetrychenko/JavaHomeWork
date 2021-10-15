package com.pb.petrychenko.hm2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tanya;
        tanya = scan.nextInt();
        if (tanya >= 0 && tanya <= 14) {
                System.out.print ("[0-14]");}
        else if (tanya >= 15 && tanya <= 35) { System.out.print ("[15-35]");}
        else if(tanya >= 36 && tanya <= 50)
        {System.out.println("[36-50]");}
         else if (tanya >= 51 && tanya <= 100)
        {System.out.println("[51-100]");}
        else if (tanya > 100)
        {System.out.println("число не попало впромежуток");}

    }
}