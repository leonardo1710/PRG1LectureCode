package at.ac.fhcampuswien.lecture07.bb08112024.square;

import at.ac.fhcampuswien.lecture07.bb08112024.Rectangle;

public class App {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1, 3);
        // System.out.println(r.c); // we cannot access protected c since we are not in the same package and we do not extend Rectangle
    }
}
