package at.ac.fhcampuswien.lecture03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamplesBB {
    public static void main(String[] args) {
       // showArrayExamples();
        Scanner scanner = new Scanner(System.in);

        System.out.println("rows:");
        int rows = scanner.nextInt();

        System.out.println("cols:");
        int cols = scanner.nextInt();

        printStarTable(rows, cols);


        System.out.println("###########");
        printStarTable(10, 2);
        System.out.println("###########");

        printStarTable(1, 6);
    }

    public static void printStarTable(int rows, int cols){
        for (int i = 0; i < rows; i++) {
            String result = printStarCols(cols);
            System.out.println(result);
            //System.out.println();
        }
    }

    public static String printStarCols(int cnt){
        String result = "";

        for (int i = 0; i < cnt; i++) {
            //System.out.print("* ");
            result += "* ";
        }

        return result;
    }

    public static void showArrayExamples(){
        String[] names = new String[3];

        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Jimmy";
        // names[3] = "Bart";


        String msg = "Hello";

        msg = msg.toLowerCase();

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = names.length - 1; i >= 0 ; i--) {
            System.out.println(names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names);

        System.out.println(Arrays.toString(names));


        int[][] matrix = new int[3][3];

        Arrays.deepToString(matrix);

        String[] names2 = {"Jan", "Ann"};
    }
}
