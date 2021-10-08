package com.company.loop_examples;

import java.util.Scanner;

/*
Döngü içerisinde sayının kaç basamaklı olduğunu bulan kod yazılır.
* */
public class Loop3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number");

        int num;
        while((num = Integer.parseInt(kb.nextLine())) != 0) {
            int countOfDigits = getDigitsCount(num);
            System.out.printf("The number of digits %d is : %d%n", num, countOfDigits);
            System.out.print("Enter a number: ");
        }
        System.out.println("The number of digits 0 is: 1");
    }
    /* Açıklama:
       1234 = (1*1000) + (2*100) + (3*10) + (4*1)
       1234      num = 1234      count = 1
       1234 / 10 num = 123       count = 2
       123 / 10  num = 12        count = 3
       12 / 10   num = 1         count = 4
       1 / 10    num = 0.1 = 0   count = 4 döngü sonlanır.
    */
    public static int getDigitsCount(int num) {
        if(num == 0)
            return 1;

        int count = 0;
        while(num != 0) {
            ++count;
            num /= 10;
        }
        return count;
    }
}
