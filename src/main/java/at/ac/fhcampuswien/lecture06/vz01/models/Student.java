package at.ac.fhcampuswien.lecture06.vz01.models;

public class Student extends Person {
    private int matrikeno;

    public Student(String fn, String ln, int age, int matrikeno){
        super(fn, ln, age);

        // special
        this.matrikeno = matrikeno;
    }

    @Override
    public void sleep() {
        System.out.println(this.getFirstname() + " sleeps never...");
    }
    // Add Getters and Setters

    // Add Default Constructor

    // Add another Constructor

    // Implement some methods

}
