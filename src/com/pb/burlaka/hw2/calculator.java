package com.pb.burlaka.hw2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        String sign;
        System.out.print("Введите значение х = ");
        x = scan.nextInt();
        System.out.print("Введите значение y = ");
        y = scan.nextInt();
        System.out.print("Введите одну из операций (-, +, /, *): ");
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println(" x + y = " + (x+y));
                break;
            case "-":
                System.out.println(" x - y = " + (x-y));
                break;
            case "*":
                System.out.println(" x * y = " + (x*y));
                break;
            case "/":
                if (y == 0) {
                        System.out.println("Делить на ноль невозможно");
                } else {
                        System.out.println(" x / y =  " + (x/y));
                    }
                break;
        }
    }
}
