package at.ac.fhcampuswien.lecture04;

import at.ac.fhcampuswien.lecture04.characters.GameCharacter;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting the game...");


        /*
        GameCharacter character = new GameCharacter("Homer");

        character.walk(12);
        character.attack();
        // character.strength = -10;
        character.setStrength(10);

        int myCharacterStrength = character.getStrength();


        GameCharacter character2 = new GameCharacter("Bart", 14);
        */


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
                GameCharacter character3 = new GameCharacter(name, strength);
                System.out.println("character created");
                System.out.println(character3);
            }

        }while (input == 1);

        System.out.println("Game stopped. Bye bye!");
    }
}
