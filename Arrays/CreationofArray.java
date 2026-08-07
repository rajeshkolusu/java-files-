package Arrays;

import java.util.Scanner;

public class CreationofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int ele = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ele;

            System.out.print("\t" + arr[i]);
            ele++;
        }

        int array[] = { 23, 45, 67, 88 };
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println(" \n string type array ");
        String arr2[] = new String[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("enter the elemnets into array:");
            arr2[i] = sc.nextLine();
        }
        for (String num : arr2) {
            System.out.println(num);
        }
    }
}
