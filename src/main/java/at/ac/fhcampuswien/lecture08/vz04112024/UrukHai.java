package at.ac.fhcampuswien.lecture08.vz04112024;

public class UrukHai extends Creature {
    public UrukHai() {
        super("Uruk-hai", 150);
    }

    @Override
    public void attack(Creature target) {
        if(target != this) {
            int damage = 15;
            System.out.println(name + " attacks fiercely with a sword!");
            target.takeDamage(damage);
        }
    }
}
