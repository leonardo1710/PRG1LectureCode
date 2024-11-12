package at.ac.fhcampuswien.lecture09.vz12112024;

public class SaleProduct extends Product{

    // Overloading rather than overriding
    // @Override
    public Product recommend(SaleProduct ref) {
        System.out.println("recommending a sale");
        return new Product();
    }

    @Override
    public SaleProduct recommend(Product ref) {
        System.out.println("Recommending a sale product with additional benefits.");
        return new SaleProduct();
    }

    // Overloading rather than overriding
    // @Override
    public Product recommend(Object ref) {
        return new Product();
    }

    // Not correct; Exception introduces a broader behavior than original method
//    public Product recommend(Product re) throws Exception {
//        return new Product();
//    }


}
