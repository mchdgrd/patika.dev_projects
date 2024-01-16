package Java101;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısı giriniz: ");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        int space = 0;
        for (int i = n * 2 - 1; i > 0; i -= 2) {
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            space++;
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
