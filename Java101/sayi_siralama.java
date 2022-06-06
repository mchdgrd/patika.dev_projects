package Java101;

import java.util.Scanner;

public class sayi_siralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int a = sc.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int b = sc.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int c = sc.nextInt();

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
        if (a > b && b > c) {
            System.out.println("a > b > c");
        } else if (a > c && c > b) {
            System.out.println("a > c > b");
        } else if (b > a && a > c) {
            System.out.println("b > a > c");
        } else if (b > c && c > a) {
            System.out.println("b > c > a");
        } else if (c > b && b > a) {
            System.out.println("c > b > a");
        } else {
            System.out.println("c > a > b");
        }

        sc.close();
    }
}
