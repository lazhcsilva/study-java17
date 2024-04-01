package application;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

record GroveryItem(String name, String type, int count){
    public GroveryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Program {

    public static void main(String[] args) {
        GroveryItem[] groceryArray = new GroveryItem[3];
        groceryArray[0] = new GroveryItem("milk");
        groceryArray[1] = new GroveryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroveryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroveryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroveryItem> groveryList = new ArrayList<>();
        groveryList.add(new GroveryItem("Butter"));
    }

}
