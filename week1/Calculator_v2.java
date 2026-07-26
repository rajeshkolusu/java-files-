package week1;

import java.util.Scanner;

public class Calculator_v2 {
    public static void main(String[] args) {
        System.out.println("enter the two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(" the sum of two numbers : " + (a + b) + "\n" +
                " product of two numbers :" + (a * b) + "\n" +
                " division of two numbers :" + (a / b) + "\n" +
                "the difference between two numbers :" + (a - b) + "\n" +
                "the remainder of two numbers :" + (a % b));
        System.out.println(" enter the message :");
        sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println("yahoo \t" + s1);

        sc.close();
    }
}
