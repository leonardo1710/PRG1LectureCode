package at.ac.fhcampuswien.lecture06.vz03;

import at.ac.fhcampuswien.lecture06.vz03.models.Lecturer;
import at.ac.fhcampuswien.lecture06.vz03.models.Person;
import at.ac.fhcampuswien.lecture06.vz03.models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // create a list of persons
        List<Person> persons = new ArrayList<>();

        // instantiate student and lecturer objects
        Student student1 = new Student("Jane", "Maier", 22);
        Student student2 = new Student("Bart", "Simpsons", 10);
        Lecturer lecturer = new Lecturer("Joyce", "Visne", 60);

        // add objects to persons list
        persons.add(student1);
        persons.add(student2);
        persons.add(lecturer);

        // loop the arraylist and print the persons
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }

        // sort the arraylist -> needs Comparable interface implemented in person class
        Collections.sort(persons);

        //List<Person> personsSorted = persons.stream().sorted().toList();

        // foreach loop the list
        for (Person person: persons) {
            System.out.println(person);
        }

        // demo of methods
        student2.drinkCoffee();
        lecturer.drinkCoffee();

        lecturer.programming();

        student2.programming();

        student1.learn("math");

        student2.learn("english");

        student1.didLearnWell();

    }
}
