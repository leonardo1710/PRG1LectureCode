package at.ac.fhcampuswien.lecture10.vz19112024;

import java.util.*;

public class App {

    public static void main(String[] args) {


        // ArrayList is a more convenient variant of arrays
        // dynamic -> resizable
        // create an ArrayList of type String
        List<String> fruits = new ArrayList<>();
        // loop all fruits an filter beginning with "a"


        // add elements to the list
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("orange");

        // loop the list with for each
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // remove element via index
        fruits.remove(1);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // get a specific element via index
        System.out.println(fruits.get(0));


        // A map stores data using key-value pairs
        // each key can only exist once in the map

        // create a map using type String for key and String for value
        HashMap<String, String> dictionary = new HashMap<>();

        // add new key-values to the map
        dictionary.put("hallo", "hello");
        dictionary.put("Morgen", "morning");
        dictionary.put("gut", "well");

        // get a value by key
        String translation = dictionary.get("hallo");
        System.out.println(translation);

        // remove a value by key
        dictionary.remove("hallo");

        // Set is an unordered collection
        // and stores only unique objects - no duplications
        Set<String> mySet = new HashSet<>();
        mySet.add("a");
        mySet.add("b");
        mySet.add("c");
        mySet.add("a"); // will not store a second "a" inside set

        for (String e : mySet) {
            System.out.println(e);
        }


        // sorting
        List<Member> members = new ArrayList<>();
        members.add(new Member("Ada Lovelace", 160));
        members.add(new Member("Yao Ming", 229));
        members.add(new Member("Bart Simpson", 122));

        System.out.println("Members unsorted:");
        for (Member m : members) {
            System.out.println(m);
        }

        System.out.println("Members sorted:");
        Collections.sort(members);

        for (Member m : members) {
            System.out.println(m);
        }


        // GENERICS
        // lets say we want to create our own implementation of a list container
        // we want to be able to manage lists of strings
        //      add(String element) - add a string to the list
        //      get(int index)      - read via index
        // so we create an interface ListOfStrings
        ListOfStrings myStringList;


        // in the future we also want to manage lists of numbers
        // which also provides the methods add() and get()
        ListOfNumbers myNumberList;

        // so a new list interface for each type?

        // SOLUTION - use generics and type parameters
        // GenericList interface
        GenericList<String> myStrings = new ArrayGenericList<>(5);
        myStrings.add("hello");
        myStrings.add("generics");

        System.out.println("String list: " + myStrings);
        System.out.println("element at index 1: " + myStrings.get(1));


        GenericList<Integer> myNumbers = new ArrayGenericList<>(3);
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(4);

        System.out.println("Integer list: " + myNumbers);
        System.out.println("Element at index 1: " + myNumbers.get(1));


        // GENERICS and SUBTYPING
        // Is List<String> a subtype of List<Object>?
        // -> NO!
//        List<String> stringList = new ArrayList<>();
//        List<Object> objectList = stringList; // hypothetical subtype relationship
//        objectList.add(123);                  // allowed because objectList can hold any Object
//        String str = stringList.get(0);       // Type error! The list now contains an Integer
        // To prevent such unsafe operations, Java enforces invariance in generics.
        // This means List<String> and List<Object> are distinct and incompatible types.


        // 1) WORK AROUND for limitations in invariant generics
        // using the WILDCARD operator - ?

        Set<String> set1 = new HashSet<>();
        // not possible to use a different type than String here
        // set1 = new HashSet<Number>();

        // wildcard can be any type
        Set<?> set2;
        set2 = new HashSet<String>();
        set2 = new HashSet<Object>();
        // but not possible to create objects with wildcard
        // here the type must be known!
        // set2 = new HashSet<?>();

        /* Examples of Static Casts */
//        List<Double> doubleList = List.of(20.1, 2.1);
//        List<Integer> intList = doubleList; // compiler error: incompatoble types

        Object obj = List.of("A", "B", "C");

        // List<String> is a parameterized type.
        // Due to type erasure, at runtime, List<String> and List<Integer> both become just List.
        // The instanceof operator cannot distinguish between different parameterized types because the type information (String in this case) is erased at runtime.
//        if(obj instanceof List<String>){
//
//        }

        // The List<?> wildcard indicates "a list of some type," but it doesn't rely on specific type information that has been erased.
        if(obj instanceof List<?>){

        }

        /* Examples of Dynamic Casts */
//        List<Double> doubleList = List.of(22.1, 2.3344, 11.2);
//        Object obj2 = doubleList;
//        List<Integer> intList = (List<Integer>) obj2;   // ClassCastException at runtime
//        Integer intValue = intList.get(1);

        // TODO: update printList method so it works with List<String>, List<Object> or any oder List<T> using wildcards
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("another");

        // printList(numbers);
        // printList(words);

        // TODO: update printList to be bounded to Object or its subtypes


        /* Example of generic method that accepts all Number types to calculate sum of a list of numbers */
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        List<Float> floatList = List.of(1.1f, 2.2f, 3.3f);

        System.out.println("Sum of intList: " + calculateSum(intList));
        System.out.println("Sum of doubleList: " + calculateSum(doubleList));
        System.out.println("Sum of floatList: " + calculateSum(floatList));
    }

    // Generic method to calculate the sum of a list of numbers
    public static <T extends Number> double calculateSum(List<T> list) {
        double sum = 0.0; // accumulator as double to handle all number types
        for (T number : list) {
            sum += number.doubleValue(); // use doubleValue() for numeric conversion
        }
        return sum;
    }

    // TODO: this method should work with any List<T> as parameter
    public static void printList(List<String> list) {
        for(Object o: list) {
            System.out.println(o);
        }
    }

    // Using wildcard operator
//    public static void printList(List<? extends Object> list) {
//        for (Object item : list) {
//            System.out.println(item);
//        }
//    }

    // using type parameter
//    public static <T extends Object> void printList(List<T> list) {
//        for (T item : list) {
//            System.out.println(item);
//        }
//    }



}
