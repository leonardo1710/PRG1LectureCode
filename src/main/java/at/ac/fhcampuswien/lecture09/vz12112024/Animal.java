package at.ac.fhcampuswien.lecture09.vz12112024;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void sleep(){
        System.out.println(this.name + " sleeps.");
    }

    public void eat(){
        System.out.println(this.name + " eats.");
    }


}
