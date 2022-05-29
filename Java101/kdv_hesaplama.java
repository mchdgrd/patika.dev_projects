package Java101;
import java.util.Scanner;

public class kdv_hesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fiyatı giriniz: ");
        double tutar= sc.nextDouble();
        if (tutar<=0){
            System.out.println("Tutar sıfırdan küçük ya da sıfıra eşit olamaz.");
        } else if (tutar <=1000) {
            KdvBul(tutar, 0.18);
        } else {
            KdvBul(tutar, 0.08);
        }
        
    }

    public static void KdvBul (double tutar, double kdv){
        System.out.println("Tutar: "+ tutar);
        System.out.println("KDV oranı: "+ kdv);
        System.out.println("Toplam tutar: "+(tutar+(tutar*kdv)));
    }
}
