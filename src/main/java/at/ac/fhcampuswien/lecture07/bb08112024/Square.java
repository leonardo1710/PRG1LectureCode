package at.ac.fhcampuswien.lecture07.bb08112024;

public class Square extends Rectangle{
    public Square(int a, int b) {
        super(a, b);
        System.out.println(super.c);    // we can access c since it is protected and all subclasses can access protected variables
        // System.out.println(super.d);    // we cannot access private attributes, even in child classes
    }
}
