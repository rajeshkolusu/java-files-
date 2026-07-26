package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println(" enter the numebr :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int digit;
        int j = n;
        while (j > 0) {
            digit = j % 10;
            rev = rev * 10 + digit;
            j = j / 10;
        }
        if (rev == n) {
            System.err.println("the number is a palindrome");

        } else {
            System.out.println("not a palindrome");
        }

        System.out.println(rev);
        input.close();
    }
}
