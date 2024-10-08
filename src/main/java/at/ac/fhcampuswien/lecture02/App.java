package at.ac.fhcampuswien.lecture02;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // lecture 1 recap

        // check user age

//        System.out.println("Enter your age:");
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//
//        // child -> age <= 12
//        // teenager -> age > 12 and age < 18
//        // adult -> age >= 18
//
//        if(age < 0) {
//
//        } else if(age <= 12) {
//            System.out.println("you are a child! go to bed!");
//        } else if (age < 18) {
//            System.out.println("you are a teenager!");
//        } else {
//            System.out.println("you are an adult");
//        }

//        // type casting
//        int sum = (int) (10.2 + 10 + 80L + 0xface + 99.9999999);
//        int sum2 = (int) 10.2 + 10 + (int) 80L + 0xface + (int) 99.9999999;
//
//        System.out.println("compared sums: " + sum + " " + sum2);


//        // formatting
//        double d = 99.923459;
//        System.out.printf(Locale.GERMAN, "my number formatted %f", d);
//        String myFormattedString = String.format(Locale.ENGLISH, "my number %f", d);
//
//        int number = 10;
//        System.out.printf(Locale.US, "my number formatted %d", number);
//        System.out.println();
//        // characters as numbers
//        char myChar = 'a';
//        int mySecondChar = (int) (myChar + 1);
//        char numberOfA = myChar;
//
//        String n = "10";
//        int n2 = Integer.parseInt(n);
//
//        System.out.println("int of char: " + numberOfA);
//        System.out.println("b: " + (char) mySecondChar);
//
//        for (char character = 'a'; character < 'z'; character++) {
//            System.out.println(character);
//        }

//* * * * *
//* * * *
//* * *
//* *
//*
        int x = 5;
        int y = 5;

        Scanner scanner = new Scanner(System.in);
        int userNumber = 2; //scanner.nextInt();


        while (x > 0) { // print rows
            y = x;
            while (y > 0) { // print cols depending on row
                System.out.print("* ");
                y--;
            }
            System.out.println();
            x--;
        }
    }
}
