package at.ac.fhcampuswien.lecture02;

import java.util.Locale;

public class AppBB26092024 {

    public static void main(String[] args) {

        // Type casting



        // type casting

        long myLong = 14;
        int myInt = (int) myLong;

        int sum = (int) (10.2 + 10 + 80L + 0xface + 99.9999999);


        int sum2 = (int) 10.2 + 10 + (int) 80L + 0xface + (int) 99.9999999;

        System.out.println("compared sums: " + sum + " " + sum2);




//        // formatting
//        double myNumber = 92.3345299347;
//        String myName = "Leon";
//
//        String myFormattedString = String.format( Locale.US,"my number is %f . my name is %s", myNumber, myName);
//
//        System.out.println(myFormattedString);
//
//        System.out.printf("my number is %f . my name is %s", myNumber, myName);


        int rows = 6;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i + 1) *2 -1 ; j++) {
                System.out.print("*");
            }

            
            System.out.println();
            
        }













//        int rows = 6;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i * 2 + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // character operations

//        for(char myChar = 'Z'; myChar < 'z'; myChar++){
//            System.out.println(myChar);
//        }
//
//        char myChar = 'a';
//        System.out.println((char)((int)myChar - 2));

    }
}
