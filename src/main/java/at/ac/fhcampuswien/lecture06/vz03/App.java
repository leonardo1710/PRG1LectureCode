package at.ac.fhcampuswien.lecture06.vz03;

import at.ac.fhcampuswien.lecture06.vz03.models.Lecturer;
import at.ac.fhcampuswien.lecture06.vz03.models.Person;
import at.ac.fhcampuswien.lecture06.vz03.models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // TOPICS
        List<Person> persons = new ArrayList<>();

        Student student1 = new Student("Jane", "Maier", 22);
        Student student2 = new Student("Bart", "Simpsons", 10);
        Lecturer lecturer = new Lecturer("Joyce", "Visne", 60);

        persons.add(student1);
        persons.add(student2);
        persons.add(lecturer);

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }

        Collections.sort(persons);

        //List<Person> personsSorted = persons.stream().sorted().toList();

        for (Person person: persons) {
            System.out.println(person);
        }

        student2.drinkCoffee();
        lecturer.drinkCoffee();

        lecturer.programming();

        student2.programming();

        student1.learn("math");

        student2.learn("english");

        student1.didLearnWell();
        //Person person = new Person("Lisa", "Simpson", 8);

        // inheritance
        // interfaces vs abstract class
        // abstract methods
        // comparable interface
        // sorting collections

    }
}
