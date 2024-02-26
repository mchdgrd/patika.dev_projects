package Java101;

public class ArrayMinMaxBulma {
    public static void main(String[] args) {
        int[] list = {1, 534, 7345, 374, 213344, 7, 234, 2345, 345, 234, 146, 36, -65, -4334, -45454, 0};
        int min = list[0];
        int max = list[0];
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
