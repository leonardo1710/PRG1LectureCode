package at.ac.fhcampuswien.lecture06.vz21102024;

public class Product {
    private String title;
    private double price;
    private double vat; // tax number in percentage: 0.00 - 1.00
    private int articleNumber;

    public Product(String title, double price, double vat, int articleNumber) {
        this.title = title;
        this.price = price;
        this.vat = vat;
        this.articleNumber = articleNumber;
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
