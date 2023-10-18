package at.ac.fhcampuswien.lecture03;

import java.util.Arrays;

public class Group3BB2023 {


    public static int findAnimal(String animalToFind, String[] myZoo) {
        //String[] myZoo = {"lion", "zebra", "ape"};
        //String animalToFind = "lion";
        for(int i = 0; i < myZoo.length; i++){
            if(myZoo[i].equals(animalToFind)){
                return i;
            }
        }

        return -1;
    }

    public static boolean findAnimal(String animalToFind) {
        String[] myZoo = {"lion", "zebra", "ape"};
        //String animalToFind = "lion";
        for(int i = 0; i < myZoo.length; i++){
            if(myZoo[i].equals(animalToFind)){
                return true;
            }
        }

        return false;
    }

    public static void printZoo() {

    }


    public static void main(String[] args) {

        String[] myZoo = {"lion", "zebra", "ape"};

        System.out.println(findAnimal("lion"));


        String[] myZoo2 = {"cat", "shark", "elephant"};
        System.out.println(findAnimal("shark", myZoo2));

        //System.out.println(findAnimal("zebra"));

        //System.out.println(findAnimal("dog"));

        /* ARRAYS */
        // simple arrays with different types
        int[] myNumbers = new int[8];


        System.out.println(Arrays.toString(myNumbers));

        for (String animal:
             myZoo) {
            System.out.println(animal.toUpperCase());
        }

        String animalToFind = "zebra";

        int pos = -1;

        for(int i = 0; i < myZoo.length; i++){
            if(myZoo[i].equals(animalToFind)){
                pos = i;
                break;
            }
        }

        System.out.println(animalToFind + " found at " + pos);


//        myNumbers[0] = 1;
//        myNumbers[1] = 2;
//        myNumbers[2] = 3;
//        myNumbers[3] = 4;
//        myNumbers[4] = 5;
//        myNumbers[5] = 6;
//        myNumbers[6] = 7;
//        myNumbers[7] = 8;

        // looping arrays
        for (int i = 0; i < 8; i++){
            myNumbers[i] = i + 1;
            System.out.print(myNumbers[i] + "-");
        }

        System.out.println(Arrays.toString(myNumbers));

        int[] myOdds = new int[0];

        for(int i = 0; i < myNumbers.length; i++){
            if (myNumbers[i]%2 != 0) {
                // check length of myOdds
                int lengthDiff = i - myOdds.length;

                int[] temp = new int[lengthDiff + 1];
                temp[lengthDiff] = myNumbers[i]; // [0, 0, 0, 7]

                for(int j = 0; j < myOdds.length; j++) { // [1, 3, 5]
                    temp[j] = myOdds[j]; // [1, 3, 5, 7]
                }
                myOdds = temp;
            }
        }

        System.out.println(Arrays.toString(myOdds));

        System.out.println(myNumbers[2]);


        // multidimensional array

        int[][] matrix = new int[5][5];

        matrix[0][0] = 4;




    }

    /* FUNCTIONS */

    // Functions with return types

    // Function parameters

    // Function overloading

    // Function scope

}
