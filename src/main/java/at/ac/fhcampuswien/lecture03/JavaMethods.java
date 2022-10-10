package at.ac.fhcampuswien.lecture03;

/**
 * METHODS
 * Methods are named blocks of code that fulfil
 * particular tasks.
 *
 * Goals:
 *      Reusability
 *      Structuring
 */
public class JavaMethods {
    public static void main(String[] args) {
        // calling methods
        printWelcomeMessage();

        // printCustomWelcomeMessage("Leon");

        int mySum = sum(4, 5);
        System.out.println("Sum = " + mySum);

        int x = 2;
        int y = 4;
        System.out.println("Sum = " + sum(x,y));

        // System.out.println(divide(x, y));

        // printTable();
    }

    /**
     * Method without return value and no parameters
     *
     * If a method does not return any value it is declared with **void** statement
     */
    public static void printWelcomeMessage(){
        System.out.println("Welcome to the program!");
    }

    /**
     * Method without return value and 1 parameter
     */
    public static void printCustomWelcomeMessage(String name){
        System.out.println("Hello " + name + "!\nWelcome to the program!");
    }

    /**
     *
     * @param augend
     * @param addend
     * @return the sum of the given values
     */
    public static int sum(int augend, int addend){
        return augend + addend;
    }

    /**
     *
     * @param dividend
     * @param divisor
     * @return the result of the division
     */
    public static double divide(double dividend, double divisor){
        return dividend / divisor;

        /*
        if(divisor > 0){
            return dividend / divisor;
        } else {
            return 0;
        }
         */
    }

    public static void printCustomWelcomeMessage(String name, boolean isActive){
        if(isActive){
            printCustomWelcomeMessage(name);
        } else {
            System.out.println("You are not an active user anymore..");
        }
    }

    /**
     * Other methods can be called from within methods
     */
    public static void printTable() {
        for(int i = 0; i <= 3; i++) {
            printTableRow();
            System.out.println();
        }
    }

    public static void printTableRow() {
        for(int i = 0; i <= 3; i++) {
            System.out.print("* ");
        }
    }
}

