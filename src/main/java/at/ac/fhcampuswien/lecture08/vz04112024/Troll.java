package at.ac.fhcampuswien.lecture08.vz04112024;

public class Troll extends Creature implements CanTurnIntoStone{
    public Troll() {
        super("Troll", 200);
    }

    @Override
    public void attack(Creature target) {
        int damage = 10;
        System.out.println(name + " brutally with a giant hammer!");
        target.takeDamage(damage);
    }

    @Override
    public void turnToStone() {
        System.out.println("sunlight turns me into stone");
    }
}
