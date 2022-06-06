package Java101;

import java.util.Scanner;

public class hava_sicakligi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        int sicaklik = sc.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik < 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

        sc.close();
    }
}
