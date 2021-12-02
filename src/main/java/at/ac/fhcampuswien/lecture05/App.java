
package at.ac.fhcampuswien.lecture05;

/**
 * Multidimensional Arrays
 * = Array of Arrays
 */
public class App {

    public static void main(String[] args) {

        // The 2-dimensional array is organized as matrices which can be represented as the collection of rows and columns.

        // creating and initializing two-dimensional array - 2 "rows" and 3 "cols"
        int[][] arr = new int[3][3]; // 0

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // cols
                //System.out.print(arr[i][j] + " ");
                arr[i][j] = cnt;
                cnt++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        // creating and initializing two-dimensional array with shortcut syntax
        int[][] arrInt = {
                {1, 2},
                {3, 4, 5},
                {4, 5},
                {2}
        };

        int posX = arrInt[2][1];

        System.out.println(posX);

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.print(arrInt[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }

    }
}
