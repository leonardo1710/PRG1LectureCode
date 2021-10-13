package at.ac.fhcampuswien.lecture02;


import java.util.Locale;
import java.util.Scanner;

public class LoopsLecture {
    /**
     * Deciding which loop to use
     *
     * While
     *      You want an Option for not looping at all - initial test of expression is false, loop is skipped
     *      You dont know how many times you need to loop.
     *      Ex.: validating user input, reading data from a file, asking user for input with option to stop at any time.
     *
     * Do-While
     *      You want to execute the loop statement at least once. Ex.: Printing a menu to the user
     *      You dont know how many times you need to loop.
     *
     * For
     *      You know the exact times you need to loop.
     *      Ex.: looping arrays
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // initialize scanner
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        System.out.println("x: " + x + " y: " + y);

        double z = scanner.nextDouble();

        System.out.println("z: " + String.format(Locale.US, "%.4f", z));


        /**
         * WHILE LOOP
         *
         * The while loop is used to iterate a part of the program
         * several times. If the number of iteration is not fixed,
         * it is recommended to use a while loop.
         */
        System.out.println("While Loop:");
        int count = 0;
        while(count < 5){
            System.out.println("count: " + count);
            count++;
        }

        /**
         * DO-WHILE LOOP
         *
         * The do-while loop is used to iterate a part of the program several times.
         * Use it if the number of iteration is not fixed and you must have to
         * execute the loop at least once.
         */
        System.out.println("Do-While Loop:");
        int count2 = 0;
        do{
            System.out.println("Count: " + count2);
            count2++;
        }while (count2 < 5);

        /**
         * FOR LOOP
         *
         * If the number of iteration is fixed, it is recommended
         * to use the for loop
         */
        System.out.println("For Loop:");
        for(int count3 = 5; count3 > 0; count3--){
            System.out.println("Count: " + count3);
        }

        //printMenu();

        //printPyramid();


        //printOtherPyramid();

        //printAlphabetPyramid();
    }

    /**
     * Prints a menu until specific value is entered
     */
    public static void printMenu(){
        int userInput = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the program!");
        System.out.println("Program will stop if you enter a number < 1");
        do{
            System.out.println("Enter a number:");
            userInput = scanner.nextInt();

            sum += userInput;

        }while (userInput > 0);

        System.out.println("The sum of your numbers is " + sum);
    }

    public static void printPyramid(){
        for(int rows = 0; rows < 5; rows++){
            for(int cols = 0; cols < rows; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printOtherPyramid(){
        for(int rows = 0; rows < 5; rows++){
            for(int cols = 5; cols > rows; cols--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printAlphabetPyramid(){
        char letter = 'a';

        for(int rows = 0; rows < 5; rows++){
            for(int cols = 0; cols < rows; cols++){
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
    }
}