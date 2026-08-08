package Arrays;

import java.util.Scanner;

public class Lc1672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int temp = 0;
        int sum = 0;

        int arr[][] = new int[3][3];
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                if (j == arr[i].length - 1) {
                    temp = sum;
                    sum = 0;
                }
            }
            arr2[i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] > largest) {
                largest = arr2[i];
            }
        }
        System.out.println(largest);

        sc.close();
    }
}
