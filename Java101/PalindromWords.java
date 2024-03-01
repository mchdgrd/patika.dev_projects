package Java101;

import java.util.Scanner;

public class PalindromWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if Palindrom!");
        while (true) {
            System.out.print("Your sentence: ");
            String word = scanner.nextLine();
            String reverseWord = "";
            for (int i = word.length()-1; i >= 0; i--) {
                reverseWord += (word.charAt(i));
            }
            System.out.println(word + " " + reverseWord + " " + word.equalsIgnoreCase(reverseWord));
        }

    }
}
