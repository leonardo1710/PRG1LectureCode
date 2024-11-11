package at.ac.fhcampuswien.lecture08.vz04112024;

public class Orc extends Creature{
    public Orc() {
        super("Orc", 100);
    }

    @Override
    public void attack(Creature target) {
        int damage = 10;
        System.out.println(name + " attacks with a club!");
        target.takeDamage(damage);
    }
}
