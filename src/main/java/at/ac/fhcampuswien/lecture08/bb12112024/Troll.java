package at.ac.fhcampuswien.lecture08.bb12112024;

public class Troll extends Creature implements CanTurnIntoStone {
    private boolean isStone;

    public Troll() {
        super("Troll", 200);
        isStone = false;
    }

    @Override
    public void attack(Creature target) {
        if(this.isStone){
            System.out.println("cannot attack :( ");
            return;
        }

        if(target.equals(this)) {
            System.out.println("cannot attack myself :(");
        } else {
            int damage = 10;
            target.takeDamage(damage);
            System.out.println(name + " brutally with a giant hammer!");
        }
    }

    @Override
    public void turnToStone() {
        System.out.println("turned into stone...");
        isStone = true;
    }
}
