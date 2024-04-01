package dev.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Program {

    public static void main(String[] args) {
         String[] originalArray = new String[] {"First", "Second", "Third"};
         var orignalList = Arrays.asList(originalArray);

         orignalList.set(0, "one");
         System.out.println("list: " + orignalList);
         System.out.println("array: " + Arrays.toString(originalArray));

         orignalList.sort(Comparator.naturalOrder());
         System.out.println("array: " + Arrays.toString(originalArray));
    }

}
