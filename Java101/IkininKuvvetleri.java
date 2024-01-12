package Java101;

import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        int ikininUssu = 1;
        int ikininUssuu = 1;

        while (ikininUssu<sayi) {
            System.out.println(ikininUssu);
            ikininUssu *= 2;
        }
    }
}
