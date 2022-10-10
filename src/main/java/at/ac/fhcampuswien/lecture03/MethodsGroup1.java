package at.ac.fhcampuswien.lecture03;

import java.util.Scanner;

public class MethodsGroup1 {

    int number = 0;

    public static void main(String[] args) {
        MethodsGroup1 myClass = new MethodsGroup1();

        myClass.printMessage("Hello users!");
        /*
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
         */

        printTable(5, 4);

        System.out.println(" breeeeeak");

        printTable(2, 10);

        System.out.println(" breeeeeak");
        printTable(10, 3);


        int sum = sum(10, 15);

        myClass.printMessage("Goodbye!");
    }

    private static void printTable(int numberOfRows, int numberOfCols) {
        for(int i = 0; i < numberOfRows; i++) {
            printTableRow(numberOfCols);
        }
    }

    private static void printTableRow(int numberOfStars) {
        for(int i = 0; i < numberOfStars; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
