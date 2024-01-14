package Java101;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        try {
            System.out.println();
            System.out.print("1. sayıyı giriniz: ");
            input = scanner.nextLine();
            int sayi1 = Integer.parseInt(input);
            System.out.print("2. sayıyı giriniz: ");
            input = scanner.nextLine();
            int sayi2 = Integer.parseInt(input);

            for (int i = sayi1; i >= 1; i--) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    System.out.print("EBOB: ");
                    System.out.println(i);
                    break;
                }
            }

            for (int j = 1; j <= Integer.max(sayi1, sayi2); j++) {
                int deger = sayi1 * j;
                if (deger % sayi2 == 0) {
                    System.out.print("EKOK: ");
                    System.out.println(deger);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Hatalı giriş.");
        }
    }
}
