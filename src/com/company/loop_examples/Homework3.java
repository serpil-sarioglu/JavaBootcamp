package com.company.loop_examples;

public class Homework3 {
/*
Aşağıda verilen şekli döngü ile ekrana yazdırınız.

      **
     ****
    ******
   ********
  **********
 ************

*/
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = i; j <= 6 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
