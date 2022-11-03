package at.ac.fhcampuswien.lecture04.VZGroup3;

public class App {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2);

        Circle circle3 = new Circle(circle2);

        Circle circle4 = new Circle(circle1);
        Circle.count++;
        //circle1.radius = 10;

        System.out.println(circle1);
        System.out.println(circle2);

        Circle[] circles = new Circle[2];
    }
}
