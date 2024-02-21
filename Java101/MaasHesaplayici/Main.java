package Java101.MaasHesaplayici;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Mehmet", 3000, 40, 2000);
        Employee e2 = new Employee("Ahmet", 2500, 45, 2010);
        Employee e3 = new Employee("Ayşe", 2000, 50, 2015);

        e1.toStr();
        e2.toStr();
        e3.toStr();
    }
}
