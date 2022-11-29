package at.ac.fhcampuswien;

import java.util.Scanner;

public class MySuperComplexApp {
    public static void main(String[] args) {
        int age;
        int num;
        int price;
        String name;

        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        num = calculateNum(2);
        price = calculatePrice(age, num);
        name = scanner.nextLine();

        if( age >= 18 && num < 200 || name.length() > 5 && age < num) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < num; j++) {
                    doSomeStuff();
                }
            }
        } else if( age > 16 || name.trim().equalsIgnoreCase("somechecks") && price <= num) {
            doSomeOtherStuff();
        } else {
            doSomeErrorCaseHandling();
        }
    }

    public static int calculatePrice(int age, int num) {
        return age * 2 + num;
    }

    public static int calculateNum(int start) {
        int num = start;
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0) {
                num = num * i;
            } else {
                num = num / i + 3;
            }
        }

        return num;
    }

    public static void doSomeStuff() {
        System.out.println("stuff");
    }

    public static void doSomeOtherStuff() {
        System.out.println("other stuff");
    }

    public static void doSomeErrorCaseHandling() {
        System.out.println("show some errors.");
    }
}
