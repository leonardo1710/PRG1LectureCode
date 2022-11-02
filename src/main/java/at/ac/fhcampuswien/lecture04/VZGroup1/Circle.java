package at.ac.fhcampuswien.lecture04.VZGroup1;

public class Circle extends Shape{
    public Circle(int c) {
        super(c);
    }

    @Override
    public int getWidth() {
        return 0;
        //return super.getWidth();
    }

    public Circle(boolean isCircle) {
        super(isCircle);
    }

    public Circle(int numberOfSomething, int x) {
        super(numberOfSomething, x);
    }
}
