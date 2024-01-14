package Java101;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sayi;
        String input;
        try {
            System.out.print("Girilecek sayı adedi: ");
            input = scanner.nextLine();
            int n = Integer.parseInt(input);

            for (int i = 1; i <= n; i++) {
                input = scanner.nextLine();
                sayi = Integer.parseInt(input);
                if (sayi < min) {
                    min = sayi;
                }
                if (sayi > max) {
                    max = sayi;
                }
            }

            System.out.println("Minimum sayı: " + min);
            System.out.println("Maximum sayı: " + max);
        } catch (Exception e) {
            System.out.println("Hatalı giriş.");
        }
    }
}
