package at.ac.fhcampuswien.lecture04;


import at.ac.fhcampuswien.lecture04.characters.MyCharacter;

public class AppBB {
    public static void main(String[] args) {

        MyCharacter.eat();

        MyCharacter myChar = new MyCharacter("Homer");

        MyCharacter myChar2 = new MyCharacter("Bart", 12);

        /*
        myChar.setStrength(10);

        System.out.println(myChar.getStrength());

        myChar.eat();
        myChar2.walk(10);

        System.out.println("char1: " + myChar.attack() + " vs. char2: " + myChar2.attack());

        System.out.println("Program ended.");

        System.out.println("Instances created: " + MyCharacter.count);

        MyCharacter myChar3 = new MyCharacter("Lisa", 12);

        System.out.println("Instances created: " + MyCharacter.count);

        */
        System.out.println(myChar);
        System.out.println(myChar2);

        String myString = myChar.toString();


    }
}
