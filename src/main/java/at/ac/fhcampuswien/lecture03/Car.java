package at.ac.fhcampuswien.lecture03;

public class Car {
    String brand;
    String color;

    int numberOfWheels;

    String engineType;

    public String getBrand(){
        return brand;
    }
    public void brake(){
        //
        System.out.println("Stop!!");
    }

    public int accelerate() {
        return 0;
    }

    public static int getCarsCount() {
        return 10;
    }
}
