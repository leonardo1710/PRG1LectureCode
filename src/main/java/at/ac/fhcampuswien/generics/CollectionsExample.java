package at.ac.fhcampuswien.generics;

import java.util.*;

public class CollectionsExample {
    /*
     * In Java, the Collections Framework provides a set of interfaces and classes to represent and manipulate groups of objects.
     * These collections simplify data manipulation and provide common interfaces for various data structures.
     *
     * LIST
     *  ordered collection of elements where elements can be inserted or accessed by their position in the list
     *  duplicates are allowed
     *  examples: ArrayList, LinkedList, Vector
     *
     * SET
     *  unordered collection of elements where
     *  no duplicates are allowed
     *  examples: HashSet, LinkedHashSet, TreeSet
     *
     * MAP
     *  key-value pairs where each key is unique
     *  not a subtype of Collection
     *  examples: HashMap, LinkedHashMap, TreeMap, Hashtable
     */
    public static void main(String[] args) {
//        hashSetExample();
//        hashMapExample();


        // object equality in hash collections
        List<Account> arrayList = new ArrayList<>();
        Account account1 = new Account(100, "John Doe");
        Account account2 = new Account(200, "Jane Doe");
        Account account3 = new Account(300, "Max Mustermann");
        Account account4 = new Account(100, "John Doe");
        arrayList.add(account1);
        arrayList.add(account2);
        arrayList.add(account3);
        arrayList.add(account1);
        arrayList.add(account2);
        arrayList.add(account4);

        Set<Account> hashSet = new HashSet<>();
//        hashSet.add(account1); //asdknskfkwe
//        hashSet.add(account4); //smdckweoief
        hashSet.addAll(arrayList);

        System.out.println("ArrayList");
        for (Account account : arrayList) {
            System.out.println(account);
        }

        System.out.println("HashSet");
        for (Account account : hashSet) {
            System.out.println(account);
        }


    }

    public static void hashSetExample() {
        // Creating a HashSet of Strings
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        // Adding a duplicate element (ignored in a HashSet)
        set.add("Red");

        // Iterating through the HashSet
        System.out.println("Elements in the HashSet:");
        for (String color : set) {
            System.out.println(color);
        }
    }

    public static void hashMapExample() {
        // Creating a HashMap with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Adding a duplicate key (value will be overwritten)
        map.put(1, "New One");

        // Accessing values by key
        System.out.println("Value for key 3: " + map.get(3));

        // Iterating through the HashMap
        System.out.println("Key-Value pairs in the HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
