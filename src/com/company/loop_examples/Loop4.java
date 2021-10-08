package com.company.loop_examples;

/*
Basamak sayılarının toplamını bulan kod yazılır.
Açıklama:
246 % 10 = 6    126 % 10 = 6
11 % 3 = 2
5 % 2 = 1

Not : int veri tipinde olan sayının 10 ile bölümünden ondalık kısım atılırak değişkene ataması yapılır.
248 = 2 + 4 + 8 = 14

248 % 10 = 8
248 / 10 = 24

24 % 10 = 4
24 / 10 = 2

2 % 10 = 2
2 / 10 = 0
*/

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num;
        while((num = Integer.parseInt(kb.nextLine())) != 0) {
            int sumOfNumberDigits = getDigitsSum(num);
            System.out.printf("The sum of the digits of %d is: %d%n", num, sumOfNumberDigits);
            System.out.print("Enter a number: ");
        }
        System.out.println("The sum of digits of the number 0 is 0");
    }
    public static int getDigitsSum(int num) {
        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}




























