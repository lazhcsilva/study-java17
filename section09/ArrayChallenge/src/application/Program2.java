package application;

import java.util.Arrays;
import java.util.Random;

public class Program2 {

    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[] {7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray(int num){
        Random random = new Random();
        int[] newInt = new int[num];
        for(int i = 0; i < num; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    private static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i +1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
