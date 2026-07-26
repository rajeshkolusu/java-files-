package Loops;

public class Primev2 {
    public static void main(String[] args) {
        int count = 0;
        int j;
        for (int i = 1; i <= 100; i++) {

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
        System.out.println(" \n " + "the number of prime numbers between 1 to 100 are =" + count);
    }
}
