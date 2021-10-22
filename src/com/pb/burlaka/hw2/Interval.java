package com.pb.burlaka.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Введите целое число: ");
        x = scan.nextInt();
        if (0 <= x && x <= 14) { System.out.print("x в диапазоне [0...14]");}
        if (15 <= x && x <= 35) { System.out.print("x в диапазоне [15...35]");}
        if (36 <= x && x <= 50) {System.out.print("x в диапазоне [36...50]");}
        if (51 <= x && x <= 100) {System.out.print("x в диапазоне [51...100]");}
        else {System.out.print("x не подходит ни к одному из заданых промежутков");}
    }
}
