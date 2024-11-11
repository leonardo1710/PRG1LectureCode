package at.ac.fhcampuswien.lecture07.bb08112024;

public class Rectangle {
    int a;
    int b;
    protected int c;    // just to show accessibility rules
    private int d;      // just to show accessibility rules

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setWidth(int b) {

    }

    public void setHeight(int a) {
        this.a = a;
    }
}
