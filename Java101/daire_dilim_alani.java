package Java101;

import java.util.Scanner;

public class daire_dilim_alani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        int yaricap = sc.nextInt();
        System.out.print("Açıyı giriniz: ");
        int aci = sc.nextInt();
        double alan = (3.14 * (yaricap * yaricap) * aci) / 360;
        System.out.println("Dilimin alanı: " + alan);
        sc.close();
    }
}
