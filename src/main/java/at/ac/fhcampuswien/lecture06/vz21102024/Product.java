package at.ac.fhcampuswien.lecture06.vz21102024;

public class Product {
    public String title;
    private double price;
    private double vat; // tax number in percentage: 0.00 - 1.00
    private int articleNumber;

    public Product(String title, double price, double vat, int articleNumber) {
        this.title = title;
        this.price = price;
        this.vat = vat;
        this.articleNumber = articleNumber;
    }

    public Product(Product p1) {
        this(p1.title, p1.price, p1.vat, p1.articleNumber);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public double getPriceInclusiveVat() {
        return this.price * (1 + this.vat);
    }

    public double getPrice() {
        return this.price;
    }

    public void print() {
        System.out.println("###### Product Information ######");
        System.out.println("Title: " + this.title);
        System.out.println("Price: " + this.price);
        System.out.println("VAT: " + this.vat);
        System.out.println("Article number: " + this.articleNumber);
        System.out.println("#################################");
    }
}
