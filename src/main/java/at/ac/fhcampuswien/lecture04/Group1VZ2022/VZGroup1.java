package at.ac.fhcampuswien.lecture04.Group1VZ2022;

public class VZGroup1 {

    public static void main(String[] args) {
        Shape myshape1 = new Shape(true);
        Shape myshape2 = new Shape(false);
        Shape myshape3 = new Shape(true);
        Shape myshape4 = new Shape(10);

        myshape1.count = 2;

        Shape.message = "Hello";

        myshape1.isInside(myshape4);
        myshape4.isInside(myshape1);

        Shape[] shapes = new Shape[5];
    }
}
