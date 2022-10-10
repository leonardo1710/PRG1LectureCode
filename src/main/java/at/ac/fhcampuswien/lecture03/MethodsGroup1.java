package at.ac.fhcampuswien.lecture03;

import java.util.Scanner;

public class MethodsGroup1 {

    int number = 0;

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Mazda";
        myCar.engineType = "E-car";
        myCar.brake();
        myCar.accelerate();
        System.out.println(myCar.getBrand());

        Car.getCarsCount();

        Car myCar2 = new Car();
        myCar2.brand = "VW";
        System.out.println(myCar2.getBrand());

        MethodsGroup1 myClass = new MethodsGroup1();

        myClass.printMessage("Hello users!");
        myClass.printMessage("Please enter your instructions: (y/n)");

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();


        switch (userInput) {
            case "y":
                break;
            case "n":
                break;
            default:
                System.out.println("not valid");
                break;
        }

        myClass.printMessage("Goodbye!");
    }

    public void printMessage(String message){
        number = 10;
        System.out.println(message);
    }
}
