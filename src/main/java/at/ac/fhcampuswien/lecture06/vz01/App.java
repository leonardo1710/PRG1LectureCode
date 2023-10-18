package at.ac.fhcampuswien.lecture06.vz01;

import at.ac.fhcampuswien.lecture06.vz01.models.Lecturer;
import at.ac.fhcampuswien.lecture06.vz01.models.Person;
import at.ac.fhcampuswien.lecture06.vz01.models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {


    // TODO
    // Inheritance
    // Super Constructor
    // Interfaces
    // Comparable


    // Create a list of persons

    // Instantiate students and lecturer objects

    // Loop that list

    // Call some methods

    public static void main(String[] args) {
        Student student1 = new Student("Markus", "Lanz", 23, 1020202);
        Lecturer lecturer = new Lecturer("Leon", "Freudenthaler", 30);

        Student student2 = new Student("Eren", "Jaeger", 18, 11212);

        student1.sleep();
        student2.sleep();
        lecturer.sleep();

        List<Person> people = new ArrayList<>();
        people.add(lecturer);
        people.add(student1);
        people.add(student2);

        for (Person person: people) {
            System.out.println(person.getFirstname());
        }

        Collections.sort(people);

    }

    public void addPerson(Person p){
        //this.accountList.add(p)
    }
}
