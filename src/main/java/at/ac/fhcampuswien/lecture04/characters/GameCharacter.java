package at.ac.fhcampuswien.lecture04.characters;

// Game should consist of different characters
//
// Characters have a *name* which shall be set when a
// character object is created.
// The name attribute must not be accessed from outside the class
//
// Characters have a *strength* which is an int value between 0-18 - also hidden from outside the class
//
// Furthermore, characters can do the following:
//      eat
//      walk a specific number of steps
//      attack - which is calculated based on the strength value: strength * 2
//
// If a character object is printed to the console it shall be printed like:
// "name: object.name strength: object.strength"
public class GameCharacter {
    private String name;    // object/member variable
    private int strength;   // object/member variable

    public static int count;    // class variable -> belongs to the class, rather than to an instance of the class and therefore has the same value for each instance

    // constructor with name as parameter
    public GameCharacter(String name) {
        //this.name = name;
        //this.strength = 0;
        this(name, 0);  // you can also call other constructors like this
    }

    // constructor with name and strength as parameter
    public GameCharacter(String name, int strength){
        this.name = name;
        setStrength(strength);
        count++; // increase the static class variable count - count is references the same value in each object
    }

    // Getter and setter are two conventional methods that are used for retrieving and updating value of a variable.
    // Getter method for strength
    public int getStrength(){
        return this.strength;
    }

    // Setter method for strength
    public void setStrength(int strengthToBeSet){
        if(strengthToBeSet >= 0 && strengthToBeSet <= 18){
            this.strength = strengthToBeSet;
        } else {
            System.out.println("Strength value not valid.");
            this.strength = 0;
        }
    }

    // Class methods do not depend on object instances but a class itself
    // They can be called without creating an instance of the class
    public static void eat(){
        System.out.println("character eats...mhh");
    }

    public int attack(){
        return this.strength * 2;
    }

    public void collectItems(char[] items){
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i]);
        }
    }

    // THIS references the current object instance which is calling it
    public GameCharacter me(){
        return this;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " strength: " + this.strength;
    }
}
