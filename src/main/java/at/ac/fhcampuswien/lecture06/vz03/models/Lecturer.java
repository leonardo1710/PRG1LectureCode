package at.ac.fhcampuswien.lecture06.vz03.models;

public class Lecturer extends Person {


    public Lecturer(int age){
        super();// call default constructor of Person class
        this.setAge(age);
    }

    public Lecturer(String firstname, String lastname, int age) {
        super(firstname, lastname, age);    // calls other constructor of Person class
    }

    @Override
    public void programming() {
        System.out.println("dont know what im doin..");
    }
}
