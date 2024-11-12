package at.ac.fhcampuswien.lecture09.vz12112024;

public class Dog extends Animal implements NoiseCapable{
    public Dog(String name) {
        super(name);
    }

    public Dog(){
        super("Dog");
    }

    public void bark(){
        System.out.println(this.getName() + " barks.");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
