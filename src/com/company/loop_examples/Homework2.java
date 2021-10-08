package com.company.loop_examples;

public class Homework2 {
/*
Aşağıda verilen şekilde sayıları döngü ile ekrana yazdırınız.

     1
    12
   123
  1234
 12345
123456

*/
    public static void main(String[] args) {
        for (int i = 1; i <= 6 ; i++) {
            for (int j = i; j < 6 ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}
