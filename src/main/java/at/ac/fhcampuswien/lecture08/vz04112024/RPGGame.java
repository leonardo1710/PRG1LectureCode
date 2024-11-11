package at.ac.fhcampuswien.lecture08.vz04112024;

public class RPGGame {
    public static void main(String[] args) {
        // Creating creatures
        Creature orc = new Orc();
        Creature snaga = new Snaga();
        Creature urukHai = new UrukHai();
        Troll troll = new Troll();

        // Attacking with each creature
        orc.attack(snaga);
        snaga.attack(orc);
        urukHai.attack(urukHai);
        troll.attack(snaga);

        troll.turnToStone();

        // Taking damage
        orc.takeDamage(10);
        troll.takeDamage(20);


        // TODO: Turn the troll to stone

    }
}
