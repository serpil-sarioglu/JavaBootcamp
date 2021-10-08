package com.company.loop_examples;

/*
While döngüsü içerisinde pozitif ve negatif sayıların ayrı ayrı toplamını bulan kod yazılır.
*/

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Start entering numbers: ");

        int positiveSum = 0;
        int negativeSum = 0;
        int num;

        while ((num = Integer.parseInt(kb.nextLine())) != 0) {
            if(num > 0)
                positiveSum += num;
            else
                negativeSum += num;
            displayResult(positiveSum,negativeSum);
        }
    }
    public static void displayResult(int positiveSum, int negativeSum) {
        if(positiveSum > 0)
            System.out.printf("Sum of positive numbers : %d%n",positiveSum);
        else
            System.out.println("You did not enter any positive numbers");

        if(negativeSum < 0)
            System.out.printf("Sum of negative numbers :  %d%n",negativeSum);
        else
            System.out.println("You did not enter any positive numbers");
    }
}

