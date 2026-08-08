package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lc1431 {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n = sc.nextInt();
        System.err.println("enter the extra candies size:");
        int extracandies = sc.nextInt();

        int arr[] = new int[n];
        String result[] = new String[n];
        System.out.print("enter the elments into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max = Arrays.stream(arr).max().getAsInt();
        // System.out.println(max);
        for (int i = 0; i < n; i++) {

            if (arr[i] + extracandies >= max) {
                // arr[i] += extracandies;
                result[i] = "true";
            } else {
                result[i] = "false";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
