package at.ac.fhcampuswien.lecture06.bb24102024;

public class App {
    public static void main(String[] args) {
        // instantiate multiple products
        // use different constructors to do so
        Product p1 = new Product("bananas", 2.99, 0.2, 1);
        Product p2 = new Product("strawberries", 3.99, 0.2, 2);
        Product p3 = new Product("heidelbeeren", 1.99, 0.2, 3 );
        Product p4 = new Product("milka", 5.99, 0.2, 1 );

        // call product methods
        System.out.println(p1.getPriceInclusiveTax());
        System.out.println(p2.getPriceInclusiveTax(0.1));
        p3.print();

        // instantiate a cart
        Cart cart = new Cart();
        // fill products in cart
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        System.out.println(cart.getProducts());
        for (Product p: cart.getProducts()) {
            System.out.println(p);
        }

        System.out.println("cart bill: " + cart.getTotalInclusiveTax());

        // object equality
        // compare with == to show hash equality check
        Product p5 = p1;
        System.out.println("compare by hash value: " + (p5 == p1));

        if(p1.equals(cart)) {
            System.out.println("p1 is a cart??");
        }

        if(p1.equals(p2)) {
            System.out.printf("products %s and %s have the same articleNumber", p1.title, p2.title);
            System.out.println();
        }

        if(p1.equals(p4)) {
            System.out.println(p1.title + " and " +p4.title + " products are the same");
        }

    }
}
