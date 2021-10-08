package com.company.loop_examples;

public class Homework6 {
    /*
    Pascal üçgeninin 10 satırını döngü ile ekrana yazdırınız.

                                          1
                                       1    1
                                    1    2    1
                                 1    3    3    1
                              1    4    6    4    1
                            1    5    10   10   5   1
                          1    6   15    20   15   6    1
                        1    7   21   35    35   21   7    1
                     1    8    28    56   70    56  28   8    1
                   1  9    36    84   126  126   84   36   9    1
                1   10  45    120  210  252   210   120  45  10    1
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int c = 1;
            for (int j = i; j < 10; j++) {
                System.out.print("    ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("  " + c + "  ");
                c = c * (i - k) / (k + 1);
            }
            System.out.println("");
        }
    }
}
