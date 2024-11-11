package at.ac.fhcampuswien.lecture07.bb08112024.square;

import at.ac.fhcampuswien.lecture07.bb08112024.Rectangle;

public class Square extends Rectangle {
    public Square(int a, int b) {
        super(a, b);
        System.out.println(super.c); // we can access protected c even though we are not in the same package as Rectangle, but because we are a subclass of Rectangle
    }
}
