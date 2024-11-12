package at.ac.fhcampuswien.lecture09.vz12112024;

public class Cat extends Animal implements NoiseCapable{

    public Cat(String name) {
        super(name);
    }

    public Cat(){
        super("Cat");
    }

    public void purr(){
        System.out.println(this.getName() + " purrs.");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
