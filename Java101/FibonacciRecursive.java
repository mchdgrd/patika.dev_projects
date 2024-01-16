package Java101;

import java.util.Scanner;

public class FibonacciRecursive {

    static int fib (int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        System.out.println(fib(n));
    }
}
