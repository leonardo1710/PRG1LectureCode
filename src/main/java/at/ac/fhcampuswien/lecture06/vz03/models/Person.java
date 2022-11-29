package at.ac.fhcampuswien.lecture06.vz03.models;

// abstract classes cannot be instantiated with the new keyword
// Person class implements Comparable interface to make it sortable
public abstract class Person implements Comparable<Person> {
    private String firstname;
    private String lastname;
    private int age;

    // default constructor
    public Person(){

    }

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public void setAge(int age) {
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


    // override compareTo from Comparable interface
    // configures HOW objects will be sorted
    @Override
    public int compareTo(Person other) {
        if(other.age < this.age){
            return 1;
        } else if (other.age >= this.age) {
            return -1;
        } else {
            return 0;
        }
    }

    public void drinkCoffee(){
        System.out.println(this.firstname + ": mhh yummy im awake now");
    }

    // abstract method declaration which "forces" child classes to implement it
    public abstract void programming();

    @Override
    public String toString() {
        return this.firstname + " " + this.lastname;
    }
}
