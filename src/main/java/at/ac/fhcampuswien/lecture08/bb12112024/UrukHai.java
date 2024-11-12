package at.ac.fhcampuswien.lecture08.bb12112024;

public class UrukHai extends Creature {
    public UrukHai() {
        super("Uruk-hai", 150);
    }

    @Override
    public void attack(Creature target) {
        if(target.equals(this)) {
            System.out.println("cannot attack myself :(");
        } else {
            int damage = 20;
            target.takeDamage(damage);
       //     System.out.println(name + " brutally with a giant hammer!");
            System.out.println(name + " attacks fiercely with a sword!");
        }
    }

}
