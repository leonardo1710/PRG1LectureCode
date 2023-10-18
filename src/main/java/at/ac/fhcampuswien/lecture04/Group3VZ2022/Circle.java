package at.ac.fhcampuswien.lecture04.Group3VZ2022;

public class Circle {
    // object variable
    private int radius;
    // class variable
    public static int count;

    // constructor
    public Circle(){
        this.radius = 1;
        count++;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Circle circleToCopy){
        this.radius = circleToCopy.radius;
    }

    // override the toString() method of Object class
    @Override
    public String toString() {
        return "radius of circle:" + this.radius;
    }
}
