package Java101;

import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short islem = -1;
        do {
            System.out.println("\n\nHesap Makinesi\n-------------------");
            System.out.print("Birinci sayıyı giriniz: ");
            int num1 = sc.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int num2 = sc.nextInt();

            System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
            System.out.println("0-Çıkış\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
            System.out.print("Seçiminiz: ");
            islem = sc.nextShort();
            int value = 0;
            switch (islem) {
                case 0:
                    System.out.println("Çıkış yapılıyor.");
                    break;
                case 1:
                    value = num1 + num2;
                    break;
                case 2:
                    value = num1 - num2;
                    break;
                case 3:
                    value = num1 * num2;
                    break;
                case 4:
                    value = num1 / num2;
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
                    break;
            }

            if(islem<5 &&islem>0){
                System.out.println("Sonuç: " + value);
            }

        } while (islem != 0);

        sc.close();
    }

}
