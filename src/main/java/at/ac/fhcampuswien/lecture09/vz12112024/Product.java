package at.ac.fhcampuswien.lecture09.vz12112024;

// Substitution principle
public class Product {

    public Product recommend(Product ref) {
        System.out.println("Recommending a generic product.");
        return new Product();
    }

}
