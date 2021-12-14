package at.ac.fhcampuswien.lecture06.characters;

public abstract class Orc implements ICreature{
    protected int age;
    protected String location;  // all subclasses can access this variable

    public void attackRoar(){
        System.out.println("Orc attack! Grrrr!");
    }

    public void attack(){
        System.out.println("Do attack");
        this.attackRoar();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + this.location;  // get the instantiated class name
    }

    public abstract void eat(); // all subclasses MUST implement this method

    @Override
    public void walk(int distance) {
        System.out.println("Orc walk " + distance*2);   // implementation of method from Interface ICreature
    }

}
