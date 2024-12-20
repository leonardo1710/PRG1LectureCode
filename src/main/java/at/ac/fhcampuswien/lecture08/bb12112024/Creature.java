package at.ac.fhcampuswien.lecture08.bb12112024;

public abstract class Creature {
    protected String name;
    protected int health;

    // Constructor
    public Creature(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attack(Creature target);

    // Method to reduce health when attacked
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage, health now: " + health);
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }

    public final boolean isAlive() {
        return health > 0;
    }
}
