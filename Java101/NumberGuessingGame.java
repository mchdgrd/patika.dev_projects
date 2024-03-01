package Java101;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("There is a number on my mind between 0-100.");
        int sayi = (int) Math.round(Math.random()*100);
        boolean isWon = false;
        for (int i = 0; i < 5;) {
            System.out.print("Your Guess: ");
            int tahmin = scanner.nextInt();
            if (tahmin < 0 || tahmin > 100) {
                System.out.println("Please enter a number between 0-100 ..");
            } else {
                if (tahmin == sayi) {
                    System.out.println("Congratulations. You WON!");
                    isWon = true;
                    break;
                } else if (tahmin < sayi) {
                    System.out.println("UP!");
                } else {
                    System.out.println("DOWN!");
                }
                i++;
            }
        }
        if (!isWon) {
            System.out.println("End of the game. You LOSE!");
        }
    }
}
