package Java101;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySayilariSiralama {
    public static void main(String[] args) {
        System.out.print("Total count of number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + ". number: ");
            list[i] = scanner.nextInt();
        }

        System.out.println("Numbers Entered -> " + Arrays.toString(list));

        boolean flag = true;
        int count = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < n - 1; i++) {
                int a = list[i];
                int b = list[i + 1];

                if (b < a) {
                    count++;
                    list[i] = b;
                    list[i + 1] = a;
                    flag = true;
                }
            }
        }

        System.out.println("Sorted from smallest to largest in " + count + " transactions -> " + Arrays.toString(list));
    }
}
