package at.ac.fhcampuswien.lecture04;

import at.ac.fhcampuswien.lecture04.characters.GameCharacter;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World!");
        myList.remove(0);

        GameCharacter myChar = new GameCharacter("Homer");

        GameCharacter myChar2 = new GameCharacter("Bart", 10);


        GameCharacter.eat();
        GameCharacter.eat();

        System.out.println("Attack");

        int attackMyChar = myChar.attack();
        int attackMyChar2 = myChar2.attack();

        if(attackMyChar > attackMyChar2){
            //
            System.out.println(myChar + " won");
        } else {
            System.out.println(myChar2 + " won");
        }

        // create items list in game
        char[] itemsToCollect = {'a', 'b', 'c'};
        char[] items = new char[3];

        items[0] = 'a';
        items[1] = 'b';
        items[2] = 'c';

        /*

        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().charAt(0);

        String input2 = scanner.nextLine(); //rg

        if(input2.equals("r") || input2.equals("g") || input2.equals("b") || input2 == "b"){

        }

         */

        char myCharacter = 'a';
        for(int i = 1; i <= items.length; i++){
            //items[i] = myCharacter;
        }



        // if user input there
        //      items = new char[1]
        myChar.collectItems(itemsToCollect);







        /*
        GameCharacter.eat();    // call a static class method -> without instantiation of class

        GameCharacter character1 = new GameCharacter("Homer", 14);  // create an instance (object) of class
        System.out.println(character1.me());

        System.out.println("attack = " + character1.attack());

        GameCharacter character2 = new GameCharacter("Bart");
        System.out.println(character2.me());

        character2.setStrength(15);
        System.out.println(character2.me());

        System.out.println(character1.getStrength());

        System.out.println("char1 count = " + character1.count);    // static variables are same for each object of this class

        System.out.println("char2 count = " + character2.count);

        System.out.println("Starting the game...");


        int input;
        Scanner scanner = new Scanner(System.in);

        do{ // print the menu until value other than 1 is entered
            System.out.println("Enter 1 to create a character.");
            System.out.println("Enter any other number to stop game.");

            input = Integer.parseInt(scanner.nextLine());

            if(input == 1){
                System.out.println("Enter a character name:");
                String name = scanner.nextLine();

                System.out.println("Enter a character strength:");
                int strength = Integer.parseInt(scanner.nextLine());

                // TODO Create character

                GameCharacter character = new GameCharacter(name, strength);

                System.out.println("Character created");
                System.out.println(character);
            }

        }while (input == 1);
        */
        System.out.println("Game stopped. Bye bye!");


        for(int i = 0; i < 6; i++){

            if(i == 0 || i == 3 || i == 5){
                for (int j = 0; j < 6; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.println("* ");

            }
        }

    }

    /*


    * * * * *
    *
    * * * * *
    *
    * * * * *




     */
}
