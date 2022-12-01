package at.ac.fhcampuswien.lecture06.vz01.models;

public abstract class Person implements Comparable<Person>{
    private String firstname;
    private String lastname;
    private int age;

    public Person(){

    }

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public abstract void sleep();


    @Override
    public int compareTo(Person person) {
        if(person.age < this.age){
            return -1;
        } else if (person.age > this.age) {
            return 1;
        } else {
            return 0;
        }

    }
}
