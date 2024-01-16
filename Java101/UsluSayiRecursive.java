package Java101;

import java.util.Scanner;

public class UsluSayiRecursive {
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, --exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("Taban: ");
        input = scanner.nextLine();
        int a = Integer.parseInt(input);
        System.out.print("Üs: ");
        input = scanner.nextLine();
        int b = Integer.parseInt(input);

        System.out.println(a + " üssü " + b + ", " + power(a, b) + " eder.");
    }
}
