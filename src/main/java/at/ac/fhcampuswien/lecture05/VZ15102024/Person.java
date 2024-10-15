package at.ac.fhcampuswien.lecture05.VZ15102024;

public class Person {
    String name;
    int age;
    int id = 2;
    static int cnt = 0;

    public Person(String name) {
        cnt++;
        this.id = cnt;
        this.name = name;
        this.age = 10;
    }

    @Override
    public String toString() {
        return this.name + " is years old: " + this.age + " id: " + this.id;
    }
}
