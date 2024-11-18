package at.ac.fhcampuswien.lecture09.bb21112024;

public class SaleProduct extends Product {

    // BAD subtyping
    // rather overloading than overriding
    // example of a stronger precondition
    // @Override
    public Product recommend(SaleProduct ref) {
        System.out.println("recommending a sale");
        return new Product();
    }

    // OK - overriding is possible
    // stronger postcondition
    @Override
    public SaleProduct recommend(Product ref) {
        System.out.println("Recommending a sale product with additional benefits.");
        return new SaleProduct();
    }

//    @Override
//    public Product recommend(Product ref) {
//        System.out.println("Can only override this method if there is no stronger implementation");
//        return new Product();
//    }

    // Would be OK in true subtyping
    // but Java interprets this as overriding rather than overloading
    // @Override
    public Product recommend(Object ref) {
        System.out.println("example of true subtyping but java does not allow to override here...");
        return new Product();
    }

    // Not correct; Exception introduces a broader behavior than original method
//    public Product recommend(Product ref) throws Exception {
//
//    }


}
