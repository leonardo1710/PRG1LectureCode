package at.ac.fhcampuswien.lecture06.vz03.models;

public class Lecturer extends Person {

    public Lecturer(String firstname, String lastname, int age) {
        super(firstname, lastname, age);
    }

    @Override
    public void programming() {
        System.out.println("dont know what im doin..");
    }

    public Lecturer(int age){
        super();
        //String fn = "John";
        //String ln = "Doe";
        this.setAge(age);
    }
}
