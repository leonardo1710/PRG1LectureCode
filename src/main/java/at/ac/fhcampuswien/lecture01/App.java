package at.ac.fhcampuswien.lecture01;

import java.util.Scanner;

public class App {
    /**
     *
     * Main entry point of a java application
     *
     * Hint: you can autogenerate a main function by typing `psvm` + press enter in Intellij
     */
    public static void main(String[] args) {
        /**
         * The Console
         *
         * The Java console provides information about the Java version, directories and error messages that
         * occure while running an application.
         */
        // Print a text (eg String) to the console
        System.out.print("Hello Java console!");
        System.out.println("This includes a linebreak");   // println() does include a linebreak
        // You can do calculations inside a console print statement
        System.out.println(100 - 50);   // prints 50

        /** Escape Characters **/
        System.out.println("I'm followed by 2 linebreaks\n\nNext will be 3 tab spaces\t\t\tTo use single quotes inside a string you must escape them \"Hello!\"");
        System.out.println("You can also do some multiline console prints like this:\n"
                + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ullamcorper et sapien vel placerat. "
                + "Phasellus efficitur in felis et varius. Vivamus at sollicitudin nunc. Nulla facilisi. "
                + "Cras elementum lectus id turpis egestas bibendum. Nam maximus efficitur leo, varius aliquet sapien malesuada sit amet."
        );
        /**
         * VARIABLES
         *
         * Java is a statically-typed programming language. It means, all variables must be declared
         * before its use. That is why we need to declare variable's type and name.
         */

        /** Variable Declaration and Initialisation **/
        int myInteger = 1; // declaration and initialisation variable of type integer
        String myCharacterSequence = "Hello World!"; // declaration and initialisation variable of type String
        int mySecondInteger; // declaration WITHOUT initialisation -> the value of mySecondInteger is Null

        System.out.println(myInteger);  // prints "1" to the console
        System.out.println(myInteger + 2); // prints the sum of 1 + 2 -> "3"
        System.out.println(myInteger + myCharacterSequence); // prints "1Hello World!" -> Strings and numeric values are concatinated
        // System.out.println(mySecondInteger); // compilation error -> "variable mySecondInteger might not have been initialized"

        /** Override variables **/
        myInteger = 100;
        System.out.println(myInteger + 2); //
        // myInteger = "Hello"; // compilation error -> "incompatible types: String cannot be converted to int"

        /** Increasing/Decreasing **/
        myInteger = myInteger + 1; // increase by 1 long form
        myInteger += 1; // increase by 1 short form
        myInteger++; // increase by 1 super short form
        myInteger--; // decrease by 1
        myInteger -= 1;

        /** Variable Types **/
        // Char is a single 16-bit Unicode character
        char character = 'a';
        char character2 = '\u0025'; // this is a unicode representation of "%"
        //System.out.println("You can also do calculations based on the unicode table: " + ('d' - 3));    // 'd' is represented with '100' in decimal

        // String is a sequence of chars
        String myString = "Hello";

        // Boolean data type is used to store only two possible values: true and false
        boolean myBoolean = false;

        // Byte ranges between -128 to 127
        // It is used to save memory in large data sets, because it is 4 times smaller than an integer
        byte myByte = 10;

        // Short ranges between -32.768 to 32,767
        // It is used to save memory in large data sets, because it is 2 times smaller than an integer
        short myShort = -1000;

        // Int range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
        // The int data type is generally used as a default data type for integral values unless if there is no problem about memory.
        int myInt = 230000000;

        // Long range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
        // Its default value is 0. The long data type is used when you need a range of values more than those provided by int.
        long myLong = 10000000000L;

        // Float data type is a single-precision 32-bit IEEE 754 floating point.
        // It's range is unlimited
        // The float data type should never be used for precise values, such as currency. Its default value is 0.0F.
        float myFloat = 234.5f;
        float f = 44e-1f; // e stands for exponent -> == 44 * Math.pow(10, -1)

        // Double data type is a double-precision 64-bit IEEE 754 floating point.
        // Its value range is unlimited. The double data type is generally used for decimal values just like float.
        // The double data type also should never be used for precise values, such as currency. Its default value is 0.0d.
        double myDouble = 12.3;
        double powerOf = 12.3e1; // e stands for exponent -> == 12,3 * 10^1; in code: 12.3 * Math.pow(10, 1)

        /**
         * Type Casting
         *
         * Because Java is a statically-typed language, you can not just overwrite specific type variables
         * with variables or values from other types.
         * In this case you need to use type-casting to correctly convert types.
         */

        int doubleToInt = (int)myDouble;    // convert double to int - this will lead to rounded values
        System.out.println(myDouble + " will be rounded to: " + doubleToInt);
        String doubleToString = Double.toString(myDouble);  // convert a double to string
        int stringToInt = Integer.parseInt("10"); // convert a string to int


        /**
         * CONTROL FLOW
         *
         * Java compiler executes the code from top to bottom. The statements in the code are executed according to the order in which they appear.
         * However, Java provides statements that can be used to control the flow of Java code. Such statements are called control flow statements.
         */

        /** DECISION MAKING **/
        int age = 12;

        // IF Statement
        if(age < 18){   // checks whether the operator resolves to true or false
            System.out.println("The age is < 18");  // this line is only executed if age is < 18
        }

        // IF-ELSE Statement
        if(age >= 18){
            System.out.println("The age is >= 18");  // this line is only executed if age is >= 18
        } else {
            System.out.println("You are underage!"); // this line is executed if age >= 18 resolves to "false"
        }

        // IF-ELSE-IF Ladder
        if(age < 12){
            // child
        } else if(age >= 12 && age <= 18){
            // teen
        } else if(age > 19 && age < 30){
            // twen
        } else {
            // all the rest
        }

        /** SWITCH Statement **/
        // Is normally used to define small limited cases that can happen
        String fruit = "apple";

        switch (fruit){
            case "apple":
                System.out.println("I like apples.");
                break;  // if break is not used the statement will go on.
            case "pear":
                System.out.println("I like pears.");
                break;
            case "grape":
                System.out.println("I like grapes.");
                break;
            default:
                System.out.println("Fruit with no specific case.");
                // no break needed because it is the last case anyway
        }


        /**
         * USER INPUT in console
         */
        Scanner scanner = new Scanner(System.in);   // a scanner can get input from a specific input stream - in this case the input in console
        System.out.println("Hello! Please enter your age:");
        int userAge = Integer.parseInt(scanner.nextLine()); // save user input in variable after typing and clicking enter

        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();

        System.out.println("Welcome " + userName + "!");

    }
}
