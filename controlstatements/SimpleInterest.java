package controlstatements;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the principal amount P :");
        long p = inp.nextLong();
        System.out.print(" enter the Rate of interest :");
        double r = inp.nextDouble();
        System.out.print(" enter the duration time(in years) :");
        double t = inp.nextDouble();
        // double SI = (p * r * t) / 100;

        System.out.println(" the simple interest of the given  details is :" + (p * r * t) / 100);
        inp.close();

    }
}
