package at.ac.fhcampuswien.lecture09.bb21112024.store;

public class Cart {
    private Article[] myArticles = new Article[10];
    private int articleCount = 0;

    public void printCart() {
        System.out.println("My articles:");
        for (int i = 0; i < this.myArticles.length; i++) {
            if(this.myArticles[i] != null) {
                System.out.println(this.myArticles[i]);
            }
        }
    }

    public void addToCart(int articleId, Store store){
        //int i = 0;
        for (int i = 0; i < store.getInventory().length; i++) {
            if(store.getInventory()[i].getId() == articleId){
                myArticles[articleCount] = store.getInventory()[i];
                articleCount++;
                return;
            }
        }

        System.out.println("Article with id " + articleId + " not found..");
    }

    public int countArticlesInCart(){
        return 1;
    }

    public double checkout() {
        double sum = 0;

        for (Article a: myArticles) {
            if(a != null) {
                sum += a.getPrice();
            }
        }

        return sum;
    }
}
