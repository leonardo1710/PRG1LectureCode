package at.ac.fhcampuswien.lecture04.characters;

public class GameCharacter {

    private String name;
    private int strength; // value between 0 - 18


    public GameCharacter(){

    }

    // constructor
    public GameCharacter(String name){
        this.name = name;
    }

    public GameCharacter(String name, int strength){
        this.name = name;
        setStrength(strength);
        //this.strength = strength;
    }



    // Setter
    public void setStrength(int strengthToBeApplied){
        if(strengthToBeApplied >= 0 && strengthToBeApplied <= 18){
            this.strength = strengthToBeApplied;
        } else {
            System.out.println("Value is not valid.");
        }
    }

    // Getter
    public int getStrength(){
        return this.strength;
    }


    public void walk(int distanceToWalk){
        System.out.println("Walk " + distanceToWalk + " steps.");
    }

    public int attack(){
        System.out.println("Attack!!!");
        return this.strength * 2;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }
}
