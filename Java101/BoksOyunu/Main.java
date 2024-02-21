package Java101.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ahmet", 100, 11, 85, 100);
        Fighter f2 = new Fighter("Mehmet", 100, 16, 95, 50);

        Match m = new Match(f1, f2, 80, 100);
        m.run();






//        Scanner scanner = new Scanner(System.in);
//        String input;
//        System.out.print("Taban: ");
//        input = scanner.nextLine();
//        int a = Integer.parseInt(input);
//        System.out.print("Üs: ");
    }
}
