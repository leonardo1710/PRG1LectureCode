package at.ac.fhcampuswien.lecture10.vz19112024;

public class Article implements Comparable<Article>{
    String name;
    String articleNo;
    int price;

    public static void main(String[] args) {
        Article a = new Article("videogames", "1", 59);
        System.out.println(a);

        System.out.println(a.getName());
    }

    public Article(String name, String articleNo, int price) {
        this.name = name;
        this.articleNo = articleNo;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    @Override
    public String toString() {
        return "Article: " + name + " number: " + articleNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Article(String name) {
        //this.name = name;
        this(name, "0", 0);
    }

    @Override
    public int compareTo(Article otherArticle) {
        if(this.price < otherArticle.price) {
            return -10;
        } else if (this.price == otherArticle.price){
            return 0;
        } else {
            return 1;
        }
    }
}
