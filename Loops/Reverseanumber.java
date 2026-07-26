package Loops;

import java.util.Scanner;

public class Reverseanumber {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println(" enter the numebr :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int digit;
        while (n > 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println(rev);
        System.out.println(2 % 10);
    }
}
