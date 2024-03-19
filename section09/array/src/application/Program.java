package application;

public class Program {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 1;
        myIntArray[1] = 3;
        myIntArray[2] = 9;
        myIntArray[3] = 15;
        myIntArray[4] = 36;
        myIntArray[5] = 45;
        myIntArray[6] = 69;
        myIntArray[7] = 70;
        myIntArray[8] = 80;
//        myIntArray[9] = 99;

//        System.out.println(myIntArray[9]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);

    }

}
