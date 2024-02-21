package Java101;

public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        double sum = 0;
        for (int i : numbers) {
            sum += 1 / (double) i;
        }
        System.out.println(sum / numbers.length);
    }
}
