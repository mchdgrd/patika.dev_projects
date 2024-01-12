package Java101;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Mesafe giriniz: ");
            int mesafe = scanner.nextInt();

            System.out.print("Yaşınızı giriniz: ");
            int yas = scanner.nextInt();

            System.out.print("Gidiş dönüş mü? (1: Evet, 2: Hayır): ");
            int gidisDonus = scanner.nextInt();

            if (mesafe <= 0 && yas <= 0 && (gidisDonus < 1 || gidisDonus > 2)) {
                System.out.println("Parametreler hatalı..");
            } else {

            }
        }
    }
}
