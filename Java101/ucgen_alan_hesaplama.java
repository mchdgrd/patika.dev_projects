package Java101;

import java.util.Scanner;

public class ucgen_alan_hesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double u;
        System.out.print("1. kenar: ");
        a = sc.nextInt();
        System.out.print("2. kenar: ");
        b = sc.nextInt();
        System.out.print("3. kenar: ");
        c = sc.nextInt();
        u = (a + b + c) / 2;
        System.out.println("Alan: "+Math.sqrt(u * (u - a) * (u - b) * (u - c)));

        sc.close();
    }
}
