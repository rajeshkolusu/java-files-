package Loops;

import java.util.Scanner;

public class GuessingNumber_v2 {
    public static void main(String[] args) {
        int rand = 1 + (int) (Math.random() * ((100 - 1) + 1));
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number:");
        int userinput = input.nextInt();
        int i = 1;
        if (userinput != rand) {
            while (i <= 5) {
                if (i == 5) {
                    System.err.println("Game Over! , the number is :" + rand + "\n Better Luck next time...");
                } else if (userinput < rand) {
                    System.err.println("your guess is too low.");
                    System.out.println("you have only" + (5 - i) + " chances");
                    System.out.println("guess again:");
                    userinput = input.nextInt();

                } else if (userinput > rand) {
                    System.out.println(" you guess is too  high.");
                    System.out.println("you have only" + (5 - i) + " chances");
                    System.out.println("guess again:");
                    userinput = input.nextInt();

                }
                i++;

            }
        } else {
            System.out.println("you won the Game ");
        }
        input.close();

    }
}
