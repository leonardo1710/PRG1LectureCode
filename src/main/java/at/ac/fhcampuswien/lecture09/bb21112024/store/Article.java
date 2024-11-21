package at.ac.fhcampuswien.lecture09.bb21112024.store;

public class Article {
    private int id;
    private String name;
    private double price;

    public Article(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article id: " + id + " name: " + name + " price: " + price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
