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
public class MyCharacter {
    private String name;
    private int strength = 0;

    public static int count;

    public MyCharacter(String name) {
        this.name = name;
        count++;
        //this(name, 0);
    }

    public MyCharacter(String name, int strength){
        this.name = name;
        this.strength = strength;
        count++;
    }

    // Setter
    public void setStrength(int strengthToBeSet){
        if(strengthToBeSet >= 0 && strengthToBeSet <= 18){
            this.strength = strengthToBeSet;
        } else {
            System.out.println("Strength value not valid");
        }
    }

    // Getter
    public int getStrength(){
        return this.strength;
    }

    public static void eat(){
        System.out.println("Mhhh lecker..");
    }

    public void walk(int numberOfSteps){
        System.out.println(this.name + " walks " + numberOfSteps + " steps.");
    }

    public int attack(){
        return this.strength * 2;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " strength: " + this.strength;
        //return super.toString();
    }
}
