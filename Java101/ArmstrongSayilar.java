package Java101;

import java.util.Scanner;

public class ArmstrongSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 0; i <= sayi; i++) {
            int toplam = 0;
            String sayiString = Integer.toString(i);
            int length = sayiString.length();
            for (int j = 0; j < length; j++) {
                int basamak = Integer.parseInt(sayiString.substring(j,j+1));
                toplam += (int) Math.pow(basamak,length);
            }
            if (toplam == i) {
                System.out.println(toplam);
            }
        }
    }
}
