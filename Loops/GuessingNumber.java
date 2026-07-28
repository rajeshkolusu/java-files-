package Loops;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        int rand = (1) + (int) (Math.random() * ((100 - 1) + 1));
        // System.out.println(rand);
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number: \t");
        int userinput = input.nextInt();
        if (userinput == rand) {
            System.out.println(" you won the game ");
        } else if (userinput < rand) {
            System.err.println("your guess is too low.");
            System.out.println("the number is:" + rand);
        } else if (userinput > rand) {
            System.out.println(" you guess is too  high.");
            System.out.println("the number is:" + rand);
        } else {
            System.err.println("enter the valid number!");
        }
        input.close();
    }
}
