package Java101;

import java.util.Scanner;

public class ATMParaCekme {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int tryCount = 3;
        boolean loggedIn = false;
        int select = 0;
        float balance = 1500;
        String userName, password, input;

        while (tryCount > 0) {
            if (!loggedIn) {
                System.out.print("Kullanıcı adı giriniz: ");
                userName = scanner.nextLine();
                System.out.print("Şifre giriniz: ");
                password = scanner.nextLine();

                if (userName.equals("patika") && password.equals("dev123")) {
                    System.out.println("Giriş Başarılı");
                    System.out.println("Gerede Bank | Hoş geldiniz!");
                    System.out.println();
                    loggedIn = true;
                } else {
                    if (--tryCount <= 0) {
                        System.out.println("Hesabınız bloke olmuştur.");
                    } else {
                        System.out.println("Kullanıcı adı veya şifre hatalı. Kalan deneme hakkınız: " + tryCount);
                        System.out.println();
                    }
                }
            } else {
                do {
                    System.out.println();
                    System.out.print("1-Para Yatırma | 2-Para Çekme | 3-Bakiye Sorgula | 4-Çıkış Yap\nYapmak istediğiniz işlemi seçiniz: ");
                    try {
                        input = scanner.nextLine();
                        select = Integer.parseInt(input);
                        if (select == 1) {
                            System.out.print("Yatırılacak tutarı giriniz: ");
                            input = scanner.nextLine();
                            float yatirilan = Float.parseFloat(input);
                            if (yatirilan > 0) {
                                balance += yatirilan;
                                System.out.println("Hesabınıza " + yatirilan + " lira para girişi oldu.");
                            } else {
                                System.out.println("Geçersiz tutar girdiniz.");
                            }
                        } else if (select == 2) {
                            System.out.print("Çekilecek tutarı giriniz: ");
                            input = scanner.nextLine();
                            float cekilen = Float.parseFloat(input);
                            if (cekilen > balance) {
                                System.out.println("Hesabınızda " + balance + " lira olduğu için " + cekilen + " lira çekemezsiniz.");
                            } else if (cekilen > 0) {
                                balance -= cekilen;
                                System.out.println("Hesabınızdan " + cekilen + " lira para çekildi.");
                            } else {
                                System.out.println("İşlem Geçersiz");
                            }
                        } else if (select == 3) {
                            System.out.println("Hesabınızda " + balance + " lira bulunmaktadır.");
                        } else if (select == 4) {
                            System.out.println("Çıkış Başarılı");
                            loggedIn = false;
                        } else {
                            System.out.println("1 ile 4 arasında seçim yapınız.");
                        }
                    } catch (Exception e){
                        System.out.println("Hatalı giriş yaptınız.");
                    }

                } while (select >= 1 && select <= 3);
            }
        }

    }
}
