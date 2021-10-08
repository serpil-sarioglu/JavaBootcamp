package com.company.loop_examples;

public class Homework4 {
    // 1'den 100'e kadar olan asal sayıları döngü ile ekrana yazdırınız.

    public static void main(String[] args) {
        // Bölünen sayı
        for (int i = 1; i <= 100 ; i++) {
            int counter = 0;
            // Bölen sayı
            for (int j = 1; j <= i; j++) {
                if(i % j == 0)
                    counter++;
            }
            // counter 2' ye eşit olma durumu sayının 1 ve kendisine bölümünden kalan 0 olursa gerçekleşir ve asal sayılar yazdırılır.
            if(counter == 2)
                System.out.print(i + " ");

        }

    }
}
