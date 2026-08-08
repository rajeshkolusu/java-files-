package Arrays;

import java.util.Scanner;

public class Lc1480 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println(" \n ****** running sum of array ******");
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            arr2[i] = sum;
        }
        for (int i : arr2) {
            System.out.print(" " + i);
        }
        sc.close();
    }
}
