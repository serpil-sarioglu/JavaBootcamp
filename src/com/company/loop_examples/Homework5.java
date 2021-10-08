package com.company.loop_examples;

public class Homework5 {
    /*
    1 den 500 e kadar olan Fibonacci sayılarını ekrana yazdırınız.

    0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 ...

    F(0) = 0
    F(1) = 1
    F(n) = F(n-1) + F(n-2) (n > 1)

    */
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%d%n", a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
