package Java101;

import java.util.Scanner;

/**
 * not_ortalamasi
 */
public class not_ortalamasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value, sum=0,count=0,notSayisi;
        System.out.print("Not sayısını giriniz: ");
        notSayisi = sc.nextInt();
        for (int i = 0; i < notSayisi; i++) {
            System.out.print((i+1)+". notu girin: ");
            value = sc.nextInt();
            sum+=value;
            count++;
        }
        int avg = sum/count;
        System.out.println("Not ortalamanız: "+avg);
        System.out.println(avg<60 ? "Kaldınız.":"Geçtiniz.");
        sc.close();
    }
}