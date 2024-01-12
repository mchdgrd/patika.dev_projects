package Java101;

import java.util.Scanner;

public class UcgenYildiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){ //satir
            for (int j = 1; j <= n-i; j++){ //bosluk
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i)-1; k++){ //yildiz
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
