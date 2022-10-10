package at.ac.fhcampuswien.lecture01;

import java.util.Date;

public class PrimitiveVSReference {
    public static void main(String[] args) {
        String message = "Hello world";

        System.out.println("lower case: " + message.toLowerCase());

        message = message.toLowerCase();
        System.out.println("original message: " + message);


        /*
        int x = 0;

        System.out.println("x: " + x);

        int y = x;

        y = 2;

        System.out.println("x: " + x);

        Date date = new Date();
        date.setTime(100);

        Date date2 = date;

        System.out.println("date2: " + date2);

        date.setTime(128000);

        System.out.println("date2: " + date2);

         */
    }
}
