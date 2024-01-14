package Java101;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Sayı giriniz: ");
            String input = scanner.nextLine();
            long sayi = Long.parseLong(input);

            for (long i = 1; i < sayi; i++){
                long toplam = 0;
                for (long j = 1; j <= i/2; j++) {
                    if (i%j == 0) {
                        toplam+=j;
                    }
                }

                if (i == toplam) {
                    System.out.println(i + " bir mükemmel sayıdır.");
                }
            }

        } catch (Exception e) {
            System.out.println("Hatalı veri girişi.");
        }

    }
}
