package Java101;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int n = scanner.nextInt();
        double toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += (double) 1 / i;
        }
        System.out.println(toplam);
    }
}
