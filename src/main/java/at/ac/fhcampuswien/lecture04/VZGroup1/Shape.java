package at.ac.fhcampuswien.lecture04.VZGroup1;

public class Shape {

    private boolean isCircle;
    public static String message;
    public int count;

    // constructor with int count
    public Shape(int c){
        count = c;
    }
    // constructor
    public Shape(boolean isCircle){
        this.isCircle = isCircle;
    }

    public Shape(int numberOfSomething, int x){
        System.out.println("hello world");
    }

    public boolean isInside(Shape s){
        //
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getWidth(){
        return 1;
    }
}
