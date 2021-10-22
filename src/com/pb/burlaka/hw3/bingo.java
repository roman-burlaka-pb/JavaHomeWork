package com.pb.burlaka.hw3;

import java.util.Scanner;

public class bingo {
    public static void main(String[] args) {
        int a=0;
        int b=100;
        int randomBingo= a + (int)(Math.random() * ((b - a) + 1));
        //System.out.println("Випадково згенероване число в діапазоні [0...100]: " + randomBingo);
        System.out.println("Гра БІНГО. Потрібно вгадати випадкове число в діапазоні від 0 до 100.");
        System.out.println("Для виходу з гри введіть код 101");
        int guessBingo;
        int counter=0;
        Scanner scan = new Scanner(System.in);

        do {
            counter++;
            System.out.print("Введіть ціле число від 0 до 100: ");
            guessBingo = Integer.parseInt(scan.next());
             if (guessBingo < 0 ) {System.out.println("Введене значення не належить вказаному діапазону.");}
             else if (guessBingo > 101 ) {System.out.println("Введене значення не належить вказаному діапазону.");}
             else if  (guessBingo == 101) {System.out.println("Ви вийшли з гри."); break;}
             else if (guessBingo == randomBingo) {System.out.print("Вітаємо! Ви виграли з " + counter + " спроби.");}
             else if (guessBingo <= randomBingo) {System.out.println("Загадане число менше вказаного");}
             else if (guessBingo >= randomBingo) {System.out.println("Загадане число більше вказаного");}
             }//ду
            while (guessBingo != randomBingo);
    }//мейн
}//класс
