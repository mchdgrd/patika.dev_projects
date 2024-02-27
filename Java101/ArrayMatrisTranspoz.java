package Java101;

import java.util.Arrays;

public class ArrayMatrisTranspoz {
    public static void main(String[] args) {
        int[][] list = {
                {10, 20, 30, 40},
                {20, 30, 40, 50},
                {9, 8, 7, 6}
        };

        int[][] transpoz = new int[list[0].length][list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                transpoz[j][i] = list[i][j];
            }
        }

        System.out.println(Arrays.deepToString(transpoz));
    }
}
