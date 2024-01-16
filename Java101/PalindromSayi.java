package Java101;

import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        for (int i = 1; i < n; i++) {
            if (i == palindrom(i)) {
                System.out.println(i);
            }
        }
    }

    static int palindrom(int number) {
        int newNumber = 0;
        while (number != 0) {
            newNumber = (newNumber * 10) + (number % 10);
            number /= 10;
        }
        return newNumber;
    }
}
