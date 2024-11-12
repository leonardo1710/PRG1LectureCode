package at.ac.fhcampuswien.lecture08.bb12112024;

public class Orc extends Creature {
    public Orc() {
        super("Orc", 100);
    }

    @Override
    public void attack(Creature target) {
        if(target.equals(this)) {
            System.out.println("cannot attack myself :(");
        } else {
            int damage = 10;
            target.takeDamage(damage);
            System.out.println(name + " attacks with a club!");
            //System.out.println(name + " brutally with a giant hammer!");
        }
    }
}
