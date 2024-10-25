package at.ac.fhcampuswien.lecture06.vz21102024;

public class Cart {
    int userId;
    private Product[] products;

    public Cart(Product[] products, int userId) {
        this.products = products;
        this.userId = userId;
    }

    public Product[] getProducts() {
        return this.products;
    }

    public boolean removeProduct(Product product){
        boolean wasSomethingDeleted = false;
        Product[] newArray = new Product[this.products.length - 1];
        int cnt = 0;
        for (int i = 0; i < this.products.length; i++) {
            if(!this.products[i].equals(product)) {
                newArray[cnt] = this.products[i];
                cnt++;
            } else {
                wasSomethingDeleted = true;
            }
        }

        this.products = newArray;

        return wasSomethingDeleted;
    }

    public double getTotal() {
        double sum = 0;

        for (int i = 0; i < this.products.length; i++) {
            sum += getProducts()[i].getPrice();
        }

        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Cart)) return false;

        Cart cart = (Cart) obj;

        return this.userId == cart.userId;
    }

    public double getTotalInclusiveVat() {
        double sum = 0;

        for (int i = 0; i < this.products.length; i++) {
            sum += getProducts()[i].getPriceInclusiveVat();
        }

        return sum;
    }

    public int addProduct(Product product){
        Product[] newArray = new Product[this.products.length + 1];

        // copy old products in new array
        for (int i = 0; i < this.products.length; i++) {
            newArray[i] = this.products[i];
        }

        newArray[this.products.length] = product;

        this.products = newArray;

        return this.products.length;

    }
}
