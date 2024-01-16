package Java101;

import java.util.ArrayList;
import java.util.Scanner;

public class AsalBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısı giriniz: ");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag;
        for (int i = 2; i <=n; i++) {
            flag = false;
            for (int item : list) {
                if (i % item == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(i);
                System.out.print(i + " ");
            }
        }
    }
}
