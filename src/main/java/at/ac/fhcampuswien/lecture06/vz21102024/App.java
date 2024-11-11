package at.ac.fhcampuswien.lecture06.vz21102024;

public class App {
    public static void main(String[] args) {
        // create products
        Product p1 = new Product("apple", 1.50, 0.2, 1);
        Product p2 = new Product("banana", 1.10, 0.2, 2);
        Product p3 = new Product("strawberries", 3.99, 0.2, 3);

        p1.print();
        System.out.println(p1.getPriceInclusiveVat());
        System.out.println(p2.getPriceInclusiveVat());

        // fill cart
//        Product[] products = new Product[3];
//        products[0] = p1;
//        products[1] = p2;
//        products[2] = p3;
        Cart cart = new Cart(new Product[]{p1, p2, p3}, 1);
        Cart cart2 = new Cart(new Product[]{p1, p2, p3}, 1);

        System.out.println(cart == cart2);
        System.out.println(cart.equals(cart2));

        Product p4 = new Product("spaghetti", 2.5, 0.2, 4);
        cart.addProduct(p4);

        for (int i = 0; i < cart.getProducts().length; i++) {
            cart.getProducts()[i].print();
        }

        // call cart methods
        cart.removeProduct(p2);

//        System.out.println(cart.getProducts().length);
//
//        for (int i = 0; i < cart.getProducts().length; i++) {
//            cart.getProducts()[i].print();
//        }

        System.out.println("The total of the cart is: " + cart.getTotal());
        System.out.println("The total incl. vat of the cart is: " + cart.getTotalInclusiveVat());

        // object equality
        Product p6 = new Product("apple", 1.50, 0.2, 1);
        Product p7 = new Product("apple", 1.50, 0.2, 1);

        System.out.println("p6 equals p7? " + p6.equals(p7)); // false
        System.out.println(p6);
        System.out.println(p7);

        // copy by assignment
        //p7 = p6;
        //System.out.println("p6 equals p7? " + p6.equals(p7));

        p7 = new Product(p6);


        p6.title = "bananas";

        System.out.println(p7.title);




    }
}
