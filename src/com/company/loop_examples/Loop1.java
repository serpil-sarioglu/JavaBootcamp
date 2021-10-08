package com.company.loop_examples;
import java.util.Scanner;

/*
While döngü deyimi içerisindeki girilen num değeri 0'a eşit olana kadar sum değişkeninde toplama yapıldı.
*/

public class Loop1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Start entering numbers");

        int sum = 0;
        int num;

        while((num = Integer.parseInt((kb.nextLine()))) != 0) {
            sum += num;
            System.out.printf("Sum : %d%n",sum);
        }
    }
}
