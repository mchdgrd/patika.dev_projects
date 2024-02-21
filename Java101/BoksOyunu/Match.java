package Java101.BoksOyunu;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match (Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        boolean flag = new Random().nextBoolean();
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                writeHealth();

                if (flag) {
                    f1.hit(f2, this);
                } else {
                    f2.hit(f1, this);
                }

                flag = !flag;
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight));
    }

    void writeHealth() {
        System.out.println();
        System.out.println(this.f1.name + ": " + this.f1.health);
        System.out.println(this.f2.name + ": " + this.f2.health);
        System.out.println();
    }

}
