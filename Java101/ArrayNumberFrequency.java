package Java101;

import java.util.*;

public class ArrayNumberFrequency {
    public static void main(String[] args) {
        System.out.print("Total count of number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + ". number: ");
            list[i] = scanner.nextInt();
        }

        System.out.println("Numbers Entered -> " + Arrays.toString(list));
        System.out.println();

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : list) {
            freq.put(i, (freq.containsKey(i) ? freq.get(i) + 1 : 1));
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(" Number " + key + " entered " + value + " times.");
        }
    }
}
