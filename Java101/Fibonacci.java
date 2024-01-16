package Java101;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısı giriniz: ");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        int a = 0;
        int b = 1;
        int tmp;
        System.out.print(a + " " + b);

        for (int i = 0; i < n-2; i++) {
            System.out.print(" " + (a+b));
            tmp = a + b;
            a = b;
            b = tmp;
        }

    }
}
