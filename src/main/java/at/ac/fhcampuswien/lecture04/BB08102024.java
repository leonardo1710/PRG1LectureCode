package at.ac.fhcampuswien.lecture04;

import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class BB08102024 {
    public static void main(String[] args) {
        // 1. example
//        Implement a program which calculates the sum of a closed interval, and prints it.
//        Expect the user to write the smaller number first and then the larger number.

//        First number: 3
//        Last number: 5
//        The sum is 12

        Scanner scanner = new Scanner(System.in);
//
//        int lower, upper;
//        //int upper = 0;
//
//        do {
//            System.out.println("first number:");
//            lower = scanner.nextInt();
//
//            System.out.println("second number:");
//            upper = scanner.nextInt();
//        } while (lower > upper);
//
//
//        int sum = 0;
//        for (int i = lower; i <= upper ; i++) {
//            sum += i;
//        }
//
//        System.out.println("the sum is " + sum);



//        2. example
//        Implement a program which calculates the factorial of a number given by the user.
//
//        Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example,
//        the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24.
//        Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.


//        System.out.println("enter number:");
//        int number = scanner.nextInt();
//
//        int factorial = 1;
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }



//        3. example
//        Create a function which answers the question "Are you playing banjo?".
//        Read the user input of the name. If the name starts with the letter "R" or lower case "r",
//        you are playing banjo!

//        String name = scanner.nextLine();
//
//        if (name.charAt(name.length()-1) == 'r' || name.charAt(0) == 'R') {
//            System.out.println("you are playing banjo!");
//        }







//        4. example
//          Implement a function that reads two values from console. First a number for rows and
//                secondly a character from ascii table (starting point). Afterwards create a matrix that
//                has the given number of rows. The first row prints the given character, then each row should shift the
//                next character to the right from ascii table.

//          rows: 3
//          c: a
//          aaa
//          bbb
//          ccc


//        System.out.println("rows: ");
//        int rows = scanner.nextInt();
//
//        System.out.println("c:");
//        char letter = scanner.next().charAt(0);
//
//        if (letter >= 'a' && letter <= 'z') {
//
//            for (int i = rows; i > 0 ; i--) {
//                if (letter > 'z') {
//                    letter = 'a';
//                }
//                for (int j = i; j > 0; j--) {
//                    System.out.print(letter);
//                }
//                System.out.println();
//                letter++;
//            }
//        }





//         5. example
        // Adapt the example 4 to print as stairs. Furthermore, if the rows length is longer than the alphabet (exceed 'z')
        // start with 'a' again.
        // rows: 3
        // c: a

        // aaa
        // bb
        // c





//          6. example
//          Write a Java program that calculates the average temperature of a given number of days.
//          and determines whether the average temperature is below, above, or at room temperature.
//          First the program asks the user for a number of days. Afterwards the user enters the temperature
//          for each day (as double).
//
//          If the average temperature is below 22 degrees, the program should print: "The average temperature is below room temperature."
//          If the average temperature is exactly 22 degrees, the program should print: "The average temperature is exactly at room temperature."
//          If the average temperature is above 22 degrees, the program should print: "The average temperature is above room temperature."

//        System.out.println("enter number of days");
//        int numberOfDays = scanner.nextInt();
//        double sum = 0;
//        for (int i = 0; i < numberOfDays; i++) {
//            double degrees = scanner.nextDouble();
//            sum += degrees;
//        }
//
//        double avg = sum/numberOfDays;
//        System.out.println("the avg degrees: " + sum/numberOfDays);
//
//        if (avg < 22) {
//            System.out.printf("%.2f", avg);
//            System.out.printf(Locale.ENGLISH, "%.2f", avg);
//        } else if (avg == 22) {
//
//        } else {
//
//        }


//        Example 7
//        Given a month as an integer from 1 to 12, return to which quarter of the year
//        it belongs as an integer number.
//        For example: month 2 (February), is part of the first quarter;
//        month 6 (June), is part of the second quarter; and month 11 (November),
//        is part of the fourth quarter.

        System.out.println("enter a month:");
        int month = scanner.nextInt();

        System.out.println("quarter: " + month/4 + 1);



        //Example 8
        // Write a program to play rock, paper, scissors.
        // read input from users in console
//        "scissors", "paper" --> "Player 1 won!"
//        "scissors", "rock" --> "Player 2 won!"
//        "paper", "paper" --> "Draw!"

//        int p1points = 0;
//        int p2points = 0;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Player1: ");
//            String p1= scanner.nextLine();
//
//            System.out.println("Player2:");
//            String p2= scanner.nextLine();
//
//            if(p1.equals(p2)){
//                //System.out.println("its a draw!");
//            } else if (p1.equals("scissors") && p2.equals("paper") ||
//                    p1.equals("rock") && p2.equals("scissors") ||
//                    p1.equals("paper") && p2.equals("rock")
//            ) { // p1 wins
//                //System.out.println("p1 wins!");
//                p1points++;
//            } else {
//                //System.out.println("p2 wins!");
//                p2points++;
//            }
//        }
//
//        if (p1points > p2points){
//            System.out.println("p1 wins!");
//        } else if (p2points > p1points) {
//            System.out.println("p2 wins!");
//        } else {
//            System.out.println("its a draw!");
//        }


        //Example 9
        //add the logic to select a winner after 3 rounds of rock, paper, scissors to example 8

        // Example 10
//        Numbers ending with zeros are boring.
//
//        They might be fun in your world, but not here.
//
//        Get rid of them. Only the ending ones.
//        1450 -> 145
//        960000 -> 96
//        1050 -> 105
//        -1050 -> -105

        System.out.println("enter a number:");
        int number = scanner.nextInt();

        while (number%10 == 0) {
            number = number/10;
        }

        System.out.println("the result is: " + number);


    }
}
