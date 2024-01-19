package Java101;

import java.util.Scanner;

public class AsalSayiRecursive {
    static boolean asal(int sayi, int sayac) {
        if (sayi == sayac) {
            return true;
        } else if (sayi % sayac == 0) {
            return false;
        } else {
            return asal(sayi, ++sayac);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("Sayı giriniz: ");
        input = scanner.nextLine();
        int n = Integer.parseInt(input);

        for (int sayi = 2; sayi <= n; sayi++) {
            if (asal(sayi, 2)) {
                System.out.println(sayi + " asaldır.");
            } else {
                System.out.println(sayi + " asal değildir.");
            }
        }
    }
}
