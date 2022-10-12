package at.ac.fhcampuswien.lecture01;

import java.awt.*;

public class PrimitiveVSReferenceGroup3 {
    public static void main(String[] args) {
        int x = 1;
        int y = x;

        x = 2;

        System.out.println("y: " + y);

        Point point1 = new Point(1, 1);

        Point point2 = point1;

        System.out.println("My Point: " + point2.x);

        point1.x = 3;

        System.out.println("My Point: " + point2.x);

        String message = "Hello World!";
        message.toCharArray();
        message = message.toLowerCase();
        //message.indexOf("s", 0)
    }
}
