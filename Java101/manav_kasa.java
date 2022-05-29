package Java101;

import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Armut sayısı giriniz: ");
        double armut = 2.14 * sc.nextInt();
        System.out.print("Elma sayısı giriniz: ");
        double elma = 3.67 * sc.nextInt();
        System.out.print("Domates sayısı giriniz: ");
        double domates = 1.11 * sc.nextInt();
        System.out.print("Muz sayısı giriniz: ");
        double muz = 0.95 * sc.nextInt();
        System.out.print("Patlıcan sayısı giriniz: ");
        double patlican = 5.00 * sc.nextInt();
        double total = armut + elma + domates + muz + patlican;
        System.out.println(total);

        sc.close();
    }
}
