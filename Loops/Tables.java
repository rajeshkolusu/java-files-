package Loops;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        System.out.print("enter the number table you want :");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.print("enter the No.of steps u want :");
        int s = inp.nextInt();
        for (int i = 1; i <= s; i++) {
            System.out.println(i + "x" + n + "=" + (i * n));
        }
        inp.close();
    }
}
