package Java101;

import java.util.Scanner;

public class vke_hesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Boyunuzu(metre) giriniz: ");
        double boy = sc.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        double kilo = sc.nextDouble();
        double value = kilo / (boy * boy);
        System.out.println("VKE değeriniz: " + value);
        if (value < 18) {
            System.out.println("Düşük kilolusunuz.");
        } else if (value < 25) {
            System.out.println("Normal kilodasınız.");
        } else if (value < 30) {
            System.out.println("Obezite başlangıcı.");
        } else if (value<35){
            System.out.println("Obezsiniz.");
        } else {
            System.out.println("Aşırı obezsiniz.");
        }

        sc.close();
    }
}
