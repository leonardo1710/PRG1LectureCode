package at.ac.fhcampuswien.lecture08.bb12112024;

public class Snaga extends Creature {

    public Snaga() {
        super("Snaga", 50);
    }

    @Override
    public void attack(Creature target) {
        if(target.equals(this)) {
            System.out.println("cannot attack myself :(");
        } else {
            int damage = 5;
            target.takeDamage(damage);
            System.out.println(name + " attacks timidly with a dagger.");
        }

    }
}
