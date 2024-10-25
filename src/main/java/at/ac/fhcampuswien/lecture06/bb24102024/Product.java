package at.ac.fhcampuswien.lecture06.bb24102024;

public class Product {
    // properties
    public String title;
    private double price;
    private double vat; // tax in percent between 0-1
    private int articleNumber;

    // constructor(s)
    public Product(String title, double price, double vat, int articleNumber){
        this.title = title;
        this.price = price;
        this.vat = vat;
        this.articleNumber = articleNumber;
    }

    public Product() {
        this("", 0, 0, 0);  // call the constructor from above with default values
    }

    public Product(String title, int articleNumber) {
        this(title, 0, 0, articleNumber);
    }

    // copy constructor
    // creates a deep copy from given product
    public Product(Product p) {
        this(p.title, p.price, p.vat, p.articleNumber);
    }

    // methods
    // overload method example: getPriceInclusiveVat with and without parameter
    public double getPriceInclusiveTax() {
        return this.price * (1 + this.vat);
    }

    public double getPriceInclusiveTax(double vat) {
        return this.price * (1 + vat);
    }

    public void print() {
        System.out.println("###### Product Information ######");
        System.out.println("Title: " + this.title);
        System.out.println("Price: " + this.price);
        System.out.println("VAT: " + this.vat);
        System.out.println("Article number: " + this.articleNumber);
        System.out.println("#################################");
    }

    // override toString from Object class
    @Override
    public String toString() {
        return "title: " + this.title + " articleNumber: " + articleNumber;
    }


    // getter and setter

    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(!(obj instanceof Product)) return false;

        Product comparedProduct = (Product) obj;

        if(this.articleNumber == comparedProduct.articleNumber){    // products are identical if they have the same articleNumber
            return true;
        }
        return super.equals(obj);
    }
}
