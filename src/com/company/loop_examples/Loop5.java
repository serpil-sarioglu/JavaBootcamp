package com.company.loop_examples;

import java.util.Scanner;

// DO NOT!
// for döngüsü ile girilen sayı şarta uygunsa her adımda toplam değişkenine atanır değilse döngüden çıkar toplam değişkeni ekrana yazdırılır.
public class Loop5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int sum = 0;
        int num;
    /*
    for(int i = 0; i < 10; i++)
    1. kısım, for döngüsüne geldiğinde ilk kez ve bir kez yapılacak kısımdır.
    System.out.println("Start entering numbers: "), System.out.println("num:")

    2. kısım, for döngüsünün koşul kısmıdır. Boolean türünden bir ifade olması gerekir.

    3. kısım, döngünün bir adımı tamamlandığında bir sonraki adımı geçmek için yapacağı kontrolden hemen önce icra edilir.
     */
        for(System.out.println("Start entering numbers: "), System.out.println("num:");
            (num = Integer.parseInt(kb.nextLine())) != 0;
            sum += num, System.out.println("num:"));

        System.out.printf("Sum:%d%n", sum);
    }
}
