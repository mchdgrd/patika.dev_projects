package Java101;

import java.util.Scanner;

public class kullanici_girisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = "mchd";
        String password = "123";

        while (true) {
            System.out.print("Kullanıcı Adı: ");
            String user = sc.next();
            System.out.print("Şifre: ");
            String pass = sc.next();
            if (userName.equals(user) && password.equals(pass)) {
                System.out.println("Giriş Başarılı");
                break;
            } else if (userName.equals(user)) {
                System.out.print("Şifrenizi yanlış girdiniz.\nŞifrenizi sıfırlamak ister misiniz? \n(y or n): ");
                String answer = sc.next();
                if (answer.equals("y")) {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    pass = sc.next();
                    if (pass.equals(password)) {
                        System.out.println("Yeni şifre eskisiyle aynı olamaz.");
                    } else {
                        password = pass;
                        System.out.println("Şifre sıfırlandı.");
                    }
                } else {
                    System.out.println("Şifre Sıfırlanmadı.");
                }
            } else {
                System.out.println("Kullanıcı adı ve şifre hatalı.");
            }

        }
        sc.close();
    }
}
