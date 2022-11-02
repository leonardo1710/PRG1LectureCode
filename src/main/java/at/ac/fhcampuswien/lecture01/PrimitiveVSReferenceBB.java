package at.ac.fhcampuswien.lecture01;

import java.awt.*;

public class PrimitiveVSReferenceBB {

    public static void main(String[] args) {
        int x = 1;
        int y = x;

        System.out.println("y: " + y);

        x = 2;

        System.out.println("y: " + y);

        Point p1 = new Point(1, 1);
        Point p2 = p1;
        System.out.println("p2.x: " + p2.x);
        p1.x = 3;
        System.out.println("p2.x: " + p2.x);


        String message = new String("Hello");
        String message2 = "Hello";


    }
}
