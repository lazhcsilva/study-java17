package application;

import java.util.Arrays;
import java.util.Collections;

public class Program3 {

    public static void main(String[] args) {
        Integer[] numbers = {1, 6, 9, 15, 23};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(Integer[] numbers){
        Arrays.sort(numbers, Collections.reverseOrder());
    }

}
