package Arrays;

import java.util.Scanner;

public class LargestElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(" " + i);

        }
        int largest = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                continue;

            }
        }
        System.out.println("\n largest element in the array is :" + largest);
    }
}
