package Java101;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        int mesafe = sc.nextInt();
        double tutar;
        tutar = 10 + (mesafe * 2.20);
        if (tutar < 20) {
            tutar = 20;
        }
        System.out.println("Ücret: " + tutar);
        sc.close();
    }
}