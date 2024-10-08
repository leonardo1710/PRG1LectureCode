package at.ac.fhcampuswien.lecture03;

public class AppBB01102024 {
    public static void main(String[] args) {
        printUntilNumber2(5);

        printUntilNumber2(15);

        printUntilNumber2(2);
    }

    private static void printUntilNumber2(int num) {
        for (int j = 1;  j <= num; j++) {
            System.out.println(j);
        }
    }
}
