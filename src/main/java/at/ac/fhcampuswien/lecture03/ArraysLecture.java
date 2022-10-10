package at.ac.fhcampuswien.lecture03;

import java.util.Arrays;
/**
 * Arrays:
 *  Common data structure available in most programming languages
 *  All elements are of same type
 *  Arrays are also objects in Java
 */
public class ArraysLecture {

    public static void main(String[] args) {
        String[] myFruitsArray = new String[3]; // declare array of string elements without initialisation
        int[] myNumberArray = new int [5];  // declaration and initialisation of integer array of length 5 - is initialized with all zeros [0,0,0,0,0]
        //printArray(myNumberArray);

        // set values of elements at special index
        myNumberArray[0] = 1;
        myNumberArray[1] = 2;
        myNumberArray[2] = 3;
        myNumberArray[3] = 4;
        myNumberArray[4] = 5;

        // set values when initialising
        int[] numbers = {0, 100, -2, 7};

        System.out.println("last number: " + numbers[3]);
        System.out.println(Arrays.toString(numbers));


        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] * numbers[i] + " ");
        }

/*

        myFruitsArray = new String[3];  // string arrays are initialized with null values
        printArray(myFruitsArray);

        myFruitsArray[0] = "bananas";
        myFruitsArray[1] = "ananas";
        myFruitsArray[2] = "pears";

        printArray(myFruitsArray);

        /*
        for(int i = 0; i < myNumberArray.length; i++){
            myNumberArray[i] = i + 1;
        }
         */

        /*
        int[] myMultipliedArray = multiply(myNumberArray);
        printArray(myMultipliedArray);

         */
    }

    public static void printArray(int[] myArr){
        for(int i = 0; i < myArr.length; i++){
            System.out.println("Index: " + i + " Value: " + myArr[i]);
        }
    }

    public static int[] multiply(int[] myArr){
        int[] multipliedArray = new int [myArr.length];

        for(int i = 0; i < myArr.length; i++){
            multipliedArray[i] = myArr[i] * myArr[i];
        }

        return multipliedArray;
    }

    public static void printArray(String[] myArr){
        for(int i = 0; i < myArr.length; i++){
            System.out.println("Index: " + i + " Value: " + myArr[i]);
        }
    }
}
