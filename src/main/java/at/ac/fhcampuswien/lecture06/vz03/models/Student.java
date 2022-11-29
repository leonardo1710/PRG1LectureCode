package at.ac.fhcampuswien.lecture06.vz03.models;

public class Student extends Person implements ICanLearn, ICanEat {

    public Student(String firstname, String lastname, int age) {
        super(firstname, lastname, age);
    }

    @Override
    public void programming() {
        System.out.println("y is life so hard??");
    }

    @Override
    public void learn(String topic) {
        System.out.println(this.getFirstname() + " learns " + topic);
    }

    @Override
    public boolean didLearnWell() {
        if(this.getAge() > 50) {
            return false;
        }
        return true;
    }

    @Override
    public void eat() {

    }
}
