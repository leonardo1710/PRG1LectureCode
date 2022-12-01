package at.ac.fhcampuswien.lecture06.vz01.models;

public class Lecturer extends Person{
    public Lecturer(String fn, String ln, int age){
        super(fn, ln, age);
    }

    @Override
    public void sleep() {
        System.out.println(this.getFirstname() + " sleep very well before exams..");
    }
}
