package at.ac.fhcampuswien.lecture09.bb21112024.store;

public class Store {
    private Article[] inventory;

    public Store(){
        inventory = new Article[5];
        inventory[0] = new Article(1, "Hundefutter (trocken)", 5.99);
        inventory[1] = new Article(2, "Hundefutter (nass) 125g", 4.99);
        inventory[2] = new Article(3, "Bananen", 2.99);
        inventory[3] = new Article(4, "Vodka", 10.99);
        inventory[4] = new Article(5, "Semmel (Industrie)", 0.29);

    }

    public Store(Article[] inventory) {
        this.inventory = inventory;
    }

    public void printAllArticles(){
        System.out.println("All articles:");
        for (int i = 0; i < this.inventory.length; i++) {
            System.out.println(this.inventory[i]);
        }

//        for (Article a: inventory){
//            System.out.println(a);
//        }
    }

    public Article[] getInventory() {
        return inventory;
    }
}
