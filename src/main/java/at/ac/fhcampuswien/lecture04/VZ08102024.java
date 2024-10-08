package at.ac.fhcampuswien.lecture04;

import java.util.Scanner;

public class VZ08102024 {

    public static void main(String[] args) {
        // 1. example
//        Implement a program which calculates the sum of a closed interval, and prints it.
//        Expect the user to write the smaller number first and then the larger number.

//        First number?3
//        Last number?5
//        The sum is 12
//        System.out.println("First number (smaller number):");
//        Scanner scanner = new Scanner(System.in);
//
//        int first = scanner.nextInt();
//        System.out.println("Last number:");
//        int last = scanner.nextInt();
//
//        if (first >= last) {
//            System.out.println("first must be smaller!");
//
//        }
//        int sum = 0;
//        for (int i = first; i <= last ; i++) {
//            sum += i;
//        }
////        int sum = first;
////        while (first < last) {
////            first++;
////            sum = sum + first;
////        }
//
//        System.out.println(sum);






//        2. example
//        Implement a program which calculates the factorial of a number given by the user.
//
//        Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example,
//        the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24.
//        Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number:");
//        int number = scanner.nextInt();
//
//        if (number == 0) {
//            number = 1;
//        }
//
//        int factorial = 0;
//        for (int i = 1; i <= number ; i++) {
//            factorial *= i;
//        }
//        System.out.println("factorial is: " + factorial);


//        3. example
//        Create a function which answers the question "Are you playing banjo?".
//        Read the user input of the name. If the name starts with the letter "R" or lower case "r",
//        you are playing banjo!
//
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        if(name.charAt(0) == 'R' || name.charAt(0) == 'r') {
//            System.out.println("you are playing banjo!");
//        } else {
//            System.out.println("you are not! playing banjo!");
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

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("rows:");
//        int rows = scanner.nextInt();
//        System.out.println("c:");
//        char c = scanner.next().charAt(0);
//        int pyramid = rows;
//
//        for (int i = 1; i <= rows ; i++) {
//            if(c > 'z'){
//                c = 'a';
//            }
//            for (int j = 1; j <= pyramid ; j++) {
//                System.out.print(c);
//            }
//            System.out.println();
//            c++;
//            pyramid--;
//        }







//         5. example
//         adapt the example 4 to print stairs
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
//

//        Example 7
//        Given a month as an integer from 1 to 12, return to which quarter of the year
//        it belongs as an integer number.
//        For example: month 2 (February), is part of the first quarter;
//        month 6 (June), is part of the second quarter; and month 11 (November),
//        is part of the fourth quarter.

        //Example 8
        // Write a program to play rock, paper, scissors.
        // read input from users in console
//        "scissors", "paper" --> "Player 1 won!"
//        "scissors", "rock" --> "Player 2 won!"
//        "paper", "paper" --> "Draw!"

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

    }
}
