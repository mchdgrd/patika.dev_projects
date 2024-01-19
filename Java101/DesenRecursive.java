package Java101;

import java.util.Scanner;

public class DesenRecursive {
    static void desen(int sayi, int sayac, boolean flag) {
        if (sayac > sayi) {
            return;
        }
        System.out.print(sayac + " ");
        if (sayac <= 0) {
            flag= false;
        }
        if (flag) {
            desen(sayi, sayac-5, flag);
        } else {
            desen(sayi, sayac+5, flag);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("Sayı giriniz: ");
        input = scanner.nextLine();
        int n = Integer.parseInt(input);

        desen(n, n,true);
    }
}
