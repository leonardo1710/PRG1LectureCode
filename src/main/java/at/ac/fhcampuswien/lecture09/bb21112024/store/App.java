package at.ac.fhcampuswien.lecture09.bb21112024.store;

/**
 * Simple Store Management Program
 *
 * This program demonstrates the concept of composition in Java by managing
 * a small store with predefined articles. Users can interact with the store
 * through a console-based menu.
 */

import java.util.Scanner;

/**
 * Features:
 * - List all available articles in the store.
 * - Add articles to a shopping cart using their unique ID.
 * - View the contents of the cart.
 * - Checkout to calculate and display the total price of the items in the cart.
 *
 * Key Classes:
 * - Article: Represents an item in the store with an ID, name, and price.
 * - Store: Holds a predefined inventory of articles and provides methods to
 *   display them and find articles by ID.
 * - Cart: Represents the user's shopping cart, allowing addition of articles,
 *   listing items, and calculating the total price.
 * - App: consists of a main method that starts the program, initializes the Store and its
 *   articles. Prints a menu where users can select actions they want to take.
 *
 */

public class App {
    public static void main(String[] args) {

        // TODO: create classes

        // TODO: initialize the store with its inventory

        // TODO: initialize the cart

        // TODO: implement the menu

        System.out.println("\n--- Store Menu ---");
        System.out.println("1. List all articles");
        System.out.println("2. Add article to cart");
        System.out.println("3. View cart");
        System.out.println("4. Checkout");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");

        Scanner scanner = new Scanner(System.in);


    }
}
