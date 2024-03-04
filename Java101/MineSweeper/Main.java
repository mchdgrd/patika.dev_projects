package Java101.MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mine Sweeper Game..");
        System.out.print("Enter Map Size: ");
        int size = scanner.nextInt();

        if (size > 1) {
            Mine m = new Mine(size);

            while(!m.isFinish) {
                System.out.println();
                System.out.print("Enter Row(0-"+ (m.size-1) + "): ");
                int row = scanner.nextInt();
                System.out.print("Enter Col(0-"+ (m.size-1) + "): ");
                int col = scanner.nextInt();

                if (row < 0 | row >= m.size | col < 0 | col >= m.size) {
                    System.out.println("Invalid number range.");
                } else {
                    m.checkMine(row, col);
                }
            }
        }
    }


}
