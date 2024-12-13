package at.ac.fhcampuswien.lecture11.bb13122024;

import java.io.Serializable;

public class Elephant implements Serializable {
    private String name;
    private int age;
    private double weight;
    private double earSize;
    private String habitat;

    public Elephant(String name, int age, double weight, double earSize, String habitat) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.earSize = earSize;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Elephant: " + name + ", age: " + age + ", habitat: " + habitat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getEarSize() {
        return earSize;
    }

    public String getHabitat() {
        return habitat;
    }
}
