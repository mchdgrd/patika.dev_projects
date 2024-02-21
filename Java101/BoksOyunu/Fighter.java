package Java101.BoksOyunu;

public class Fighter {
    String name;
    int health;
    int damage;
    int weight;
    int dodge;

    Fighter(String name, int health, int damage, int weight, int dodge) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge = dodge;
    }

    void hit(Fighter foe, Match m) {
        int realDamage = getDodge(this.damage, foe.dodge);
        System.out.println(this.name + " => " + foe.name + " | " + realDamage + "/" + this.damage + " hasar verdi.");
        foe.health -= realDamage;
        if (foe.health < 0) foe.health = 0;
        System.out.println(foe.name + ": " + foe.health + " cana sahip.");

        if (foe.health <= 0) {
            m.writeHealth();
            System.out.println("########## " + this.name + " kazandı. ##########");
        }
    }

    int getDodge(int damage, int dodge) {
        return (int) (damage - ((damage * (Math.random() * dodge))/100));
    }
}
