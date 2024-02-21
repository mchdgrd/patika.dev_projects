package Java101.MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary <= 2500) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int thisYear = 2024;
        int workingYear = thisYear - this.hireYear;
        double raise;

        if (workingYear < 10) {
            raise = this.salary * 0.05;
        } else if (workingYear < 20) {
            raise = this.salary * 0.1;
        } else {
            raise = this.salary * 0.15;
        }
        return raise;
    }

    void toStr() {
        System.out.println("------------------");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Brüt maaş: " + this.salary);
        System.out.println("Net maaş: " + (this.salary-this.tax() + bonus()));
        double raise = raiseSalary();
        System.out.println("Zam: " + raise);
        this.salary += raise;
        System.out.println("Zamlı Brüt Maaş: " + this.salary);
        System.out.println("Zamlı Maaş Vergi: " + tax());
        System.out.println("Zamlı Net Maaş: " + (this.salary-this.tax() + bonus()));
        System.out.println("------------------");
        System.out.println();
    }
}
