package com.pb.petrychenko.hm2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        String sign;
        int operand2;


        operand1 = scan.nextInt();
        sign = scan.next();
        operand2 = scan.nextInt();

        int result;

        switch (sign) {
            case "+":
                result = (operand1 + operand2);
                System.out.println( + result);
                break;
            case "-":
                result = (operand1 - operand2);
                System.out.println( + result);
                break;
            case "*":
                result = operand2 * operand2;
                System.out.println ( + result);
                break;

            case "/":
                result = operand2 / operand2;
                System.out.println( + result);
                if (operand2 == 0) System.out.println("error" );

                break;


        }
    }
}