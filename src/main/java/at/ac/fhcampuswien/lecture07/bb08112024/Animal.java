package at.ac.fhcampuswien.lecture07.bb08112024;

public class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public static void prettyPrintAnimals(Animal[] animals) {
        for (Animal a: animals) {
            System.out.println(a);
        }
    }
}
