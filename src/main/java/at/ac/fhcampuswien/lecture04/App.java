package at.ac.fhcampuswien.lecture04;

import at.ac.fhcampuswien.lecture04.characters.GameCharacter;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

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

        System.out.println("Game stopped. Bye bye!");

    }
}
