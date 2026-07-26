package Loops;

import java.util.Scanner;

public class Primev2 {
    public static void main(String[] args) {
        int count = 0;
        int j;
        Scanner pr = new Scanner(System.in);
        System.out.print("enter the starting number :");
        int s = pr.nextInt();
        System.out.print("enter the ending number :");
        int e = pr.nextInt();

        for (int i = s; i <= e; i++) {

            if (i <= 1) {
                continue;

            }
            if (i == 2 || i == 3) {
                count = count + 1;
                System.out.print("," + i);
                continue;
            }
            if (i % 2 == 0 || i % 3 == 0) {
                continue;
            }
            j = 5;
            boolean isprime = true;
            while (j * j <= i) {
                if (i % j == 0 || i % (j + 2) == 0) {
                    isprime = false;
                    break;
                }
                j = j + 6;
            }
            if (isprime == true) {
                count = count + 1;
                System.out.print("," + i);

            }

        }
        System.out.println(" \n " + "the number of prime numbers between " + s + " to " + e + " are =" + count);
        pr.close();
    }
}
