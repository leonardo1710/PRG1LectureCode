package at.ac.fhcampuswien.lecture03;

public class Group2BB2023 {

     static int x = 10;


    static public int searchArrayForNumber(int[] myArr, int number) {

        for (int i = 0; i < myArr.length; i++) {
            if(myArr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        //AppBB app = new AppBB();
        int[] myArr = {1, 2, 3, 1};

        System.out.println(searchArrayForNumber(myArr, 1));

        int[] myArr2 = {0, 2, 3, 4, 6, 1};
        System.out.println(searchArrayForNumber(myArr2, 4));


        int[] myArr3 = {2, 2, 3, 7, 1};
        System.out.println(searchArrayForNumber(myArr3, 10));


//
//        int x = 10;
//        int[] myArr = {1, 2, 3, 1};
//        int[] myArr2 = new int[4];
//
//        myArr[3] = 0;
//
//        System.out.println(myArr[0]);
//
//        int[] shortenArr = new int[myArr.length - 1];
////        shortenArr[0] = myArr[0];
////        shortenArr[1] = myArr[2];
////        shortenArr[2] = myArr[3];
//
//        System.out.println(shortenArr.toString());
//        System.out.println(Arrays.toString(shortenArr));
//
//        for (int i = 0; i < myArr.length; i++) {
//            if(myArr[i] == 1) {
//                System.out.printf("Found at %d!", i);
//            }
//        }
    }
}
