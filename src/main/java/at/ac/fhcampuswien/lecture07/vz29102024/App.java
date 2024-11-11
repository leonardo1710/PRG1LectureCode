package at.ac.fhcampuswien.lecture07.vz29102024;

public class App {

    public static void main(String[] args) {
        // create classes Cat and Dog with custom sound() implementations

        // create instances of Cat and Dog using Animal type
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println();

//        animal.sound();
//        dog.sound();
//        cat.sound();

        Dog dog2 = new Dog();

        // Show polymorphism using Animal array filled with cats and dogs
        Animal[] myAnimals = new Animal[4];
        myAnimals[0] = animal;
        myAnimals[1] = dog;
        myAnimals[2] = cat;
        myAnimals[3] = new Cow();

        for (Animal a : myAnimals) {
            a.sound();
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
    }

}
