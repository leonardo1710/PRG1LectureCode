package at.ac.fhcampuswien.lecture03;

import java.util.Arrays;
import java.util.Scanner;

public class MethodExamplesGroup3 {

    public static void main(String[] args) {
        // arrayExamples();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cols: ");
        int cols = scanner.nextInt();

        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();

        printStarTable(rows, cols);

        /*
        System.out.println("breeeeak");
        printStarTable(rows);

         */

    }

    public static int[] extendArray(int[] a, int[] b){
        int[] extendedArray = new int[a.length + b.length];

        if (a.length > b.length) {
            // start with b
        } else if ( b.length > a.length) {
            // start with a
        } else {
            // switch a and b
        }

        for (int i = 0; i < extendedArray.length; i++) {
            extendedArray[i] = b[i];
            extendedArray[i + b.length] = a[i];
        }

        return extendedArray;
    }

    public static void printStarTable(int numberOfRows, int numberOfCols){
        int cnt = 0;
        /*
        while (cnt < 3) {
            System.out.println("* * *");
            cnt++;
        }
         */
        for (int i = 0; i < numberOfRows; i++) {
           // printStarColumns(3);
            String stars = printStarColumns(numberOfCols);
            System.out.println(stars);
        }
    }

    public static String printStarColumns(int numberOfColumns) {
        String output = "";
        for (int i = 0; i < numberOfColumns; i++) {
            //System.out.print("* ");
            output += "* ";
        }
        return output;
    }

    public static void arrayExamples() {
        String[] myNames = new String[3];

        myNames[0] = "Leon";
        myNames[1] = "Leo";
        myNames[2] = "Leo2";
        // myNames[3] = "Le";


        for( String name : myNames) {
            System.out.println("name: " + name);
        }

        /*
        for (int i = 0; i < 5; i--) {
            System.out.println(i);
        }
         */

        for( int i = myNames.length - 1; i >= 0; i = i - 1){
            System.out.println("name: " + myNames[i]);
        }

        myNames[2] = "John";

        int[] myNumbers = { 1, -70, 0, 23 };

        System.out.println(myNumbers);
        // Arrays.toString(myNumbers);

        System.out.println(Arrays.toString(myNumbers));

        int[][] matrix = new int[3][3];

        matrix[0][0] = 1;
        matrix[0][1] = 0;
    }

}
