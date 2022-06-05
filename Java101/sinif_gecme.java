package Java101;

import java.util.Scanner;

public class sinif_gecme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Girilecek not sayısı: ");
        int n = sc.nextInt();
        int count = 0, sum = 0;
        double avg;

        for (int i = 0; i < n; i++) {
            System.out.print((i+1)+". not: ");
            int not = sc.nextInt();
            if(not>=0 && not<=100){
                sum+=not;
                count++;
            }
        }
        avg = (double)sum/count;

        System.out.println("Not ortalaması: "+avg);
        System.out.println("Geçme durumu: " + (avg<55?"Kaldı.":"Geçti."));


        sc.close();
    }
}
