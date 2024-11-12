package at.ac.fhcampuswien.lecture10.vz19112024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("orange");

        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        fruits.remove(1);

        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits.get(0));


        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("hallo", "hello");
        dictionary.put("Morgen", "morning");
        dictionary.put("gut", "well");

        String translation = dictionary.get("hallo");
        System.out.println(translation);

        dictionary.remove("hallo");


        // sorting
        List<Member> members = new ArrayList<>();
        members.add(new Member("Ada Lovelace", 160));
        members.add(new Member("Yao Ming", 229));
        members.add(new Member("Bart Simpson", 122));

        System.out.println("Members unsorted:");
        for (Member m: members) {
            System.out.println(m);
        }

        System.out.println("Members sorted:");
        Collections.sort(members);

        for (Member m: members) {
            System.out.println(m);
        }
    }
}

