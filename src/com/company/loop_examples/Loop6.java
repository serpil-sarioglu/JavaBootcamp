package com.company.loop_examples;


import java.util.Scanner;

/*
 * 123 -> 321
 * 1. step
 * reverse = 0
 * num = 123     100 + 20 + 3
 * reverse = (0 * 10 = 0) + (123 % 10 = 3) = 3
 * num = (123 / 10 = 12)
 *
 * 2. step
 * reverse = 3
 * num = 12
 * reverse = (3 * 10 = 30) + (12 % 10 = 2) = 32
 * num = (12 / 10 = 1)
 *
 * 3. step
 * reverse = 32
 * num = 1
 * reverse = (32 * 10 = 320) + (1 % 10 = 1) = 321
 *
 * 4. step
 * 321
 * */
public class Loop6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num;
        while((num = Integer.parseInt(kb.nextLine())) != 0) {
            int reverse = getReverse(num);
            System.out.printf("The reverse of %d is %d%n", num, reverse);
            System.out.print("Enter a number: ");
        }
    }
    public static int getReverse(int num) {
        int reverse = 0;

        while(num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }
}
