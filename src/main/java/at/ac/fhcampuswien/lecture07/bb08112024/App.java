package at.ac.fhcampuswien.lecture07.bb08112024;

public class App {

    public static void main(String[] args) {
        // create classes Cat and Dog with custom sound() implementations
        Cat garfield = new Cat();

        Dog beethoven = new Dog();
        Dog lessie = new Dog();


        // call methods
        beethoven.sound();
        lessie.sound();
        garfield.purr();

        // create instances of Cat and Dog using Animal type
        Animal helloKitty = new Cat();
        Animal odie = new Dog();
        odie.sound();
        helloKitty.sound();
        // helloKitty.purr(); // does not work!

        // Show polymorphism using Animal array filled with cats and dogs
        Animal[] myAnimals = new Animal[3];
        myAnimals[0] = garfield;
        myAnimals[1] = beethoven;
        myAnimals[2] = lessie;

        for (Animal a : myAnimals) {
            a.sound();
            System.out.println(a);
            if(a instanceof Cat) { // check instance before casting
                ((Cat) a).purr();   // cast to Cat to call purr() method
            }
            //a.purr()    // error!
        }

        // Why Square and Rectangle are not real subtypes of each other
        // Liskov Substitution Principle:  if class B is a subclass of class A, then objects of class A
        // should be able to be replaced by objects of class B without altering the correctness of the program.
        // Implications:
        //    if we say that a Square is a type of Rectangle, then it should be possible to replace a Rectangle object
        //    with a Square object anywhere in the code without unexpected behavior.
        //    However, this substitution doesn’t work well for squares and rectangles.
        //
        //    Square is not a true subtype of Rectangle because a square’s width and height cannot vary independently.
        //    Rectangle is not a true subtype of Square because a rectangle does not require equal width and height.

        Rectangle r = new Rectangle(1, 3);
        System.out.println(r.c);    // c is protected, we can access it here since we are in the same package
        // System.out.println(r.d);    // d is private, we cannot access it here

    }
}
