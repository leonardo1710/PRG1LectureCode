package at.ac.fhcampuswien.lecture09.vz12112024;

public class App {
    public static void main(String[] args) {
        Product genericProduct = new Product();
        Product saleProduct = new SaleProduct();

        Product recommendedProduct = genericProduct.recommend(genericProduct); // returns Product
        Product recommendedSaleProduct = saleProduct.recommend(saleProduct);   // returns SaleProduct, but can be treated as Product


        Dog fido = new Dog("Fido");
        Dog nameless = new Dog();

        fido.bark();
        fido.eat();
        nameless.bark();


        Cat garfield = new Cat("Garfield");
        garfield.purr();

        Animal[] myPets = new Animal[2];

        myPets[0] = fido;
        myPets[1] = garfield;

        for (Animal a: myPets) {
            a.eat();
        }

        NoiseCapable[] myNoisyAnimals = new NoiseCapable[2];
        myNoisyAnimals[0] = fido;
        myNoisyAnimals[1] = garfield;

        for (NoiseCapable a: myNoisyAnimals){
            a.makeNoise();
        }
    }
}
