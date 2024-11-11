package at.ac.fhcampuswien.lecture08.vz04112024;

public class Snaga extends Creature{

    public Snaga() {
        super("Snaga", 50);
    }

    @Override
    public void attack(Creature target) {
        int damage = 5;
        System.out.println(name + " attacks timidly with a dagger.");
        target.takeDamage(5);
    }
}
