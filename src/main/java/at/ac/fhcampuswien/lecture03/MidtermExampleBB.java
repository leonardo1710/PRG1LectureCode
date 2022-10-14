package at.ac.fhcampuswien.lecture03;

import java.util.Arrays;
import java.util.Scanner;

public class MidtermExampleBB {
    // Implement all methods as public static

    public static int generateRandomMonth() {
        // write some logic to return a random number between 1 and 12
        return 1;
    }

    public static String monthMapperSolution1(){
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between ... or r");

        String userinput = scanner.nextLine();

        if(userinput.equals("r")){  // we need to get the random number
            // get a random number from generateRandomMonth
            month = generateRandomMonth();
        } else { // user input is a string so we must parse to int
            month = Integer.parseInt(userinput);
        }

        // return month string based on month value
        // TODO add other valid months
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            default:
                return "Invalid month";
        }
    }
    public static String monthMapperSolution2(){
        // initialize an array with all month cases and the default case invalid month at index 0
        String[] months = {"Invalid month", "January", "February"}; // TODO add other valid months
        int month;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between ... or r");

        String userinput = scanner.nextLine();

        if(userinput.equals("r")){
            // get a random number from generateRandomMonth
            month = generateRandomMonth();
        } else {
            month = Integer.parseInt(userinput);
        }

        if(month >= 0 && month <= 12) {
            return months[Integer.parseInt(userinput)]; // get the month from array by index and return its value
        }

        return months[0];
    }


    public static String monthMapperSolution3(){
        String month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between ... or r");

        String userinput = scanner.nextLine();

        if(userinput.equals("r")){ // get a random number from generateRandomMonth
            userinput = String.valueOf(generateRandomMonth());  // get random month and parse it to String value
        }

        // switch userInput based on String values entered - default is invalid
        // TODO add other valid cases
        switch (userinput) {
            case "1":
                month = "January";
                break;
            case "2":
                month = "February";
                break;
            default:
                month = "Invalid month";
                break;
        }

        return month;
    }

    public static int[] extendArray(int[] arrayA, int[] arrayB){
        int[] arrayC = new int[arrayA.length + arrayB.length];

        if(arrayA.length > arrayB.length) {
            // start with arrayB
            for (int i = 0; i < arrayB.length; i++) {
                arrayC[i] = arrayB[i];
            }
            // add arrayA
            for (int i = arrayB.length; i < arrayB.length + arrayA.length; i++) {
                arrayC[i] = arrayA[i - arrayB.length];
            }

        } else if (arrayA.length < arrayB.length) {

            // start with arrayA
            for (int i = 0; i < arrayA.length; i++) {
                arrayC[i] = arrayA[i];
            }

            // add arrayB
            for (int i = arrayA.length; i < arrayB.length + arrayA.length; i++) {
                arrayC[i] = arrayB[i - arrayA.length];
            }
        } else {
            // switch array indeces
            int cnt = 0;
            for (int i = 0; i < arrayB.length; i++) {
                arrayC[cnt] = arrayB[i];
                cnt++;
                arrayC[cnt] = arrayA[i];
                cnt++;
            }
        }

        return arrayC;
    }


    public static void main(String[] args) {
        // Test case A > B
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {4, 5};

        System.out.println(Arrays.toString(extendArray(arrayA, arrayB)));

        // Test case B > A
        int[] arrayA2 = {1, 2};
        int[] arrayB2 = {3, 4, 5};

        System.out.println(Arrays.toString(extendArray(arrayA2, arrayB2)));

        // Test case A.length == B.length
        int[] arrayA3 = {1, 2, 3};
        int[] arrayB3 = {4, 5, 6};

        System.out.println(Arrays.toString(extendArray(arrayA3, arrayB3)));
    }
}
