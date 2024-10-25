package at.ac.fhcampuswien.lecture06.bb24102024;

import java.util.Arrays;

public class Cart {
    //properties
    private Product[] products;

    // default constructor that sets products to empty array -> to prevent NullPointerException that happens when no initialisation took place
    public Cart(){
        products = new Product[0];
    }

    // constructor which sets products when initialised
    public Cart(Product[] products){
        this.products = products;
    }

    // getter
    public Product[] getProducts() {
        return products;
    }


    public double getTotalInclusiveTax() {
        double sum = 0;

        for (Product p: products) {
            sum += p.getPriceInclusiveTax();
        }

        return sum;
    }

    public double getTotal() {
        double sum = 0;

        for (Product p: products) {
            sum += p.getPrice();
        }

        return sum;
    }

    public void addProduct(Product product) {

        Product[] tempArr = new Product[products.length + 1];   // array size is static so we need to create a new array with 1 more element

        for (int i = 0; i < products.length; i++) { // copy existing elements from products to new array
            tempArr[i] = products[i];
        }

        //tempArr = Arrays.copyOf(products, products.length);
        tempArr[products.length] = product; // add the new product in last element
        products = tempArr; // set products attribute in object to new array
//
//        if(products != null && products.length == 0) { // we never added a product
//            Product[] tempArr = new Product[1];
//            tempArr[0] = product;
//            products = tempArr;
//        } else {
//            Product[] tempArr = new Product[products.length + 1];
//
//            for (int i = 0; i < products.length; i++) {
//                tempArr[i] = products[i];
//            }
//
//            //tempArr = Arrays.copyOf(products, products.length);
//            tempArr[products.length + 1] = product;
//            products = tempArr;
//        }
    }
}
