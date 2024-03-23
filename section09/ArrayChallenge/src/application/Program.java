package application;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Program {

    /*
        Crie um programa usando Arrays, que classifique uma lista de inteiros
        em ordem descrecent. Os valores devem ser criados randomicamente e ser
        impressos antes e depois da ordenação.
    */

    public static void main(String[] args) {
        int[] originalValue = getRandomArray(10);
        Arrays.sort(originalValue);
        System.out.println(Arrays.toString(originalValue));

        int[] copyArray = new int[10];
        descSort(originalValue);
        System.out.println(Arrays.toString(copyArray));

    }

    public static int[] getRandomArray(int num){
        Random random = new Random();
        int[] newInt = new int[num];
        for(int i = 0; i < num; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    public static int[] descSort(int[] numbers){
//        Arrays.sort(numbers, Collections.reverseOrder());
        return numbers;
    }

    public static int[] toPrimitive(Integer[] IntegerArray) {
        int[] result = new int[IntegerArray.length];
        for (int i = 0; i < IntegerArray.length; i++) {
            result[i] = IntegerArray[i].intValue();
        }
        return result;
    }
}
