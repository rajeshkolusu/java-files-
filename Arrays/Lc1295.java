package Arrays;

public class Lc1295 {
    public static void main(String[] args) {
        int count2 = 0;
        int temp = 0;
        int arr[] = { 437, 315, 322, 431, 686, 264, 442 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] >= 1) {
                arr[i] = arr[i] / 10;
                count += 1;
            }
            temp = count;
            count = 0;
            if (temp % 2 == 0) {
                count2 += 1;
            }
        }
        System.out.println(count2);
        int number = 9876;
        double n = (int) (Math.log10(number) + 1);
        System.out.println("the digit  of numebr is :" + n);

    }
}
