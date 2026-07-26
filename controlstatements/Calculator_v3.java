package controlstatements;

import java.util.Scanner;

public class Calculator_v3 {
    public static void main(String[] args) {
        System.out.println("====== MENU DRIVEN CALCULATOR ======" + "\n" +
                "1.ADDITION." + "\n" +
                "2.SUBSTRACTION." + "\n" +
                "3.MULTIPLICATION." + "\n" +
                "4.DIVISION." + "\n" +
                "5.MODULUS" + "\n" +
                "6.EXIT.");
        System.out.println("enter the two numbers");
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the fisrt number:");
        int num1 = scn.nextInt();
        System.out.print("enter the second number :");
        int num2 = scn.nextInt();
        System.out.println("choose the operations to perform ");
        int opr = scn.nextInt();
        switch (opr) {
            case 1:
                System.out.println("the sum of two numbers is :" + (num1 + num2));
                break;
            case 2:
                System.out.println("the difference is :" + (num1 - num2));
                break;
            case 3:
                System.out.println("the product of two numbers is :" + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("the division of two numers is: " + (num1 / num2));
                } else
                    System.out.println("cannot divide by zero");
                break;
            case 5:
                if (num2 != 0)
                    System.out.println("the modulo of two numbers is :" + (num1 % num2));
                else
                    System.out.println("cannot find modulo by zero");
                break;
            case 6:
                System.out.println("ur exit from the calculator");
                break;

            default:
                System.out.println("invalid choice ,please enter the number between 1 to 6.");
                break;
        }

        scn.close();
    }
}
