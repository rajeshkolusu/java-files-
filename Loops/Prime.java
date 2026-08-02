package Loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("enter the number  :");

        try (Scanner prm = new Scanner(System.in)) {
            long p = prm.nextLong();
            if (p <= 1) {
                System.out.println("the number is not a prime.");
                return;
            }
            if (p == 2 || p == 3) {
                System.out.println("the number is prime number.");
                return;
            }
            if (p % 2 == 0 || p % 3 == 0) {
                System.out.println(" the number is not a prime.");
                return;
            }
            long i = 5;
            while (i * i <= p) {
                if (p % i == 0 || p % (i + 2) == 0) {
                    System.out.println("not a prime number ");
                    return;

                }
                i += 6;
            }
            System.out.println("it is a prime number ");
        }

    }

}
