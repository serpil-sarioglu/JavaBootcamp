package com.company.loop_examples;


import java.util.Scanner;

/*
 * Parametresi ile int türünden a, b değerlerini alan ve a'nın b'ninci kuvvetini geri döndüren pow isimli metodu yazınız.
 * Math sınıfının pow isimli metodu kullanılmayacaktır.
 * -2 ^ 2 = -2 *-2 = 4
 * Metot b'nin negatif değerleri için 1 değerini döndürsün.
 * */
public class Loop7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // sonsuz döngü içinde kullanıcıdan değer istenir.
        for(;;) {
            System.out.println("Enter the base number: ");
            int baseNumber = Integer.parseInt(kb.nextLine());

            System.out.println("Enter the power of the number: ");
            int powerOfNumber = Integer.parseInt(kb.nextLine());

            System.out.printf("pow(%d, %d) = %d%n", baseNumber, powerOfNumber, pow(baseNumber,powerOfNumber));
        }
    }

    public static int pow(int baseNumber, int powerOfNumber) {
        if(powerOfNumber <= 0)
            return 1;

        int result = 1;
        // 5^3 = 5 * 5 * 5
        for (int i = 0; i < powerOfNumber; i++) {
            result *= baseNumber;
        }
        return result;
    }
}
