package Java101;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int toplam = scanner.nextInt();
        int sayi = 0;
        while(sayi<=toplam) {
            if (sayi%2 == 0) {
                System.out.println(sayi);
            }
            sayi++;
        }
    }
}
