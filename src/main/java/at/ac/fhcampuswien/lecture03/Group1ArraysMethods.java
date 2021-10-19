package at.ac.fhcampuswien.lecture03;

import java.util.Scanner;

public class Group1ArraysMethods {
    public static void main(String[] args) {
        int[] myArr = new int[5]; // {0,0,0,0,0}

        for(int i = 0; i < myArr.length; i++){
            myArr[i] = i + 1;
            System.out.println("index: " + i + " value: " + myArr[i]);
        }

        int length = 3;

        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();

        String[] fruits = new String[length]; // {null,null,null} - if length == 3
        fruits[0] = "bananas";// {"bananas",null,null}

        boolean[] myConditions = new boolean[2]; // {false,false}


        int[] myArr2 = new int[4]; // {0,0,0,0}

        for(int i = 0; i < myArr2.length; i++){
            myArr2[i] = i + 1;
        }

        printArray(myArr2);

        double result = divide(5, 10.93); // will call divide(double,double)

        System.out.println("My result: " + result);

        double result2 = divide(5, 0);  // will call divide(int,int)

        System.out.println("My result2: " + result2);
    }

    public static double divide(int x, int y){
        if(y == 0){
            System.out.println("No division by zero allowed.");
            return 0;
        }
        return x/y;
    }

    public static double divide(double x, double y){
        if(y == 0){
            System.out.println("No division by zero allowed.");
            return 0;
        }
        return x/y;
    }

    public static void printArray(int[] myArr){
        for(int i = 0; i < myArr.length; i++){
            if(i == 2){
                return;
            }
            System.out.println("index: " + i + " value: " + myArr[i]);
        }

        System.out.println("End of method");
    }
}
