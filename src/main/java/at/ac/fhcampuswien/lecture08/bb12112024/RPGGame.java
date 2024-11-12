package at.ac.fhcampuswien.lecture08.bb12112024;

public class RPGGame {
    public static void main(String[] args) {
        // Creating creatures
        // Creature creature = new Creature("generic creature", 100);
        Creature orc = new Orc();
        Creature snaga = new Snaga();
        Creature urukHai = new UrukHai();
        Troll troll = new Troll();

        // Attacking with each creature
        // creature.attack();
        orc.attack(troll);
        snaga.attack(urukHai);
        urukHai.attack(orc);
        troll.attack(troll);

        // Taking damage
        orc.takeDamage(10);
        troll.takeDamage(20);


        System.out.println("is " + orc.name + " still alive? " + orc.isAlive());

        // TODO:
        // adapt creature to not allow creating instances on it - our RPG only allows specific types
        //  -> make creature abstract
        // attack method
        //  force all subtypes of creature to implement attack
        //  -> make attack abstract
        //  adapt attack method to allow all creatures to attack a specific creature
        //  -> add parameter attack(Creature target)
        //  different attack damage depending on type
        //  -> call target.takeDamage(damage) in attack() method

        // isAlive method
        //  disallow subclasses to override isAlive
        //  -> make isAlive final


        // Create a new behavior for creatures that can turn into stone
        // make troll get that behavior
        // create Gargoyle class that also can turn into stone
        troll.turnToStone();



    }
}
