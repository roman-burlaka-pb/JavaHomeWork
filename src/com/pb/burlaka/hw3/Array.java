package com.pb.burlaka.hw3;



import java.io.IOException;
import java.util.Scanner;

public class Array {
      public static void main(String[] args) throws IOException {
          Scanner input = new Scanner(System.in);
          int masLength = 10;
          int array[] = new int[masLength];


          System.out.println("Insert array elements:");
          for (int i = 0; i < masLength; i++) {array[i] = input.nextInt();}


          System.out.print ("Inserted array elements:");
          for (int i = 0; i < masLength; i++) {System.out.print (" " + array[i]);}
          System.out.println();


          int sum = 0;
          for (int i = 0; i < array.length; i++) {sum = sum + array[i];}
          System.out.println("Sum of all elements in array: " + sum);


          int pos = 0;
          for (int i=0; i<array.length;i++)
              if (array[i]>0){pos++;}
          System.out.println("Number of element bigger than 0: " + pos);


          boolean sorted = false;
          int temp;
          while (!sorted) {
              sorted = true;
              for (int i = 0; i < array.length - 1; i++) {
                  if (array[i] > array[i+1]) {
                      temp = array[i];
                      array[i] = array[i+1];
                      array[i+1] = temp;
                      sorted = false;
                  }//if
              }//for
              for (int i = 0; i < masLength; i++);
              }//while


          System.out.print("Bubble Sortet array: ");
          for (int i = 0; i < masLength; i++) {System.out.print (" " + array[i]);}
          System.out.println();


    }//main
}//pc
