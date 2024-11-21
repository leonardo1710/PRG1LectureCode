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
        Store store = new Store();
        store.printAllArticles();

        // TODO: initialize the cart

        Cart cart = new Cart();
//        cart.printCart();
//        cart.addToCart(1, store);
//        cart.printCart();
//
//        cart.addToCart(2, store);
//
//        double sum = cart.checkout();
//        System.out.println(sum);


        Scanner scanner = new Scanner(System.in);
        int selection = 0;
        // TODO: implement the menu
        do {
            System.out.println("\n--- Store Menu ---");
            System.out.println("1. List all articles");
            System.out.println("2. Add article to cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    store.printAllArticles();
                    break;
                case 2:
                    // TODO:
                    System.out.println("Enter article id:");
                    int id = scanner.nextInt();

                    cart.addToCart(id, store);
                    break;
                case 3:
                    cart.printCart();
                    break;
                case 4:
                    System.out.println("your price: " + cart.checkout());
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong input...");
                    break;
            }
        } while (selection != 5);


    }
}
