package at.ac.fhcampuswien.lecture03;

import java.util.Scanner;

public class VZ02102024 {
    public static void main(String[] args) {



//        printUntilNumber(2);
//
//        System.out.println(sumOfNumbers(2, 4));
//
//        int sum = sumOfNumbers(5,2);
//        System.out.println(sum);

//        printUntilNumber(5);
//
//        printUntilNumber(2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("rows:");
        int rows = scanner.nextInt();
        System.out.println("character:");
        char letter = scanner.next().charAt(0);


        for (int i = 0; i < rows; i++) {
            if(letter + i > 'z'){
                letter = (char)('a' - i);  // shift letter to 'a' but keep i in mind
            }
            for (int j = rows; j > i; j--) {
                System.out.print((char)(letter + i));
            }
            System.out.println();
        }

    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static int sumOfNumbers(int start, int end) {

        int sum = 0;
        if(start >= end) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            sum += i;
            //System.out.println(i);
        }

        return sum;
    }
}
