package dev.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> groceries = new ArrayList<>();
        int menuOption = 3;

        do {
            System.out.println("Available actions:");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list");
            System.out.print("Enter a number for which action you want to do: ");
            menuOption = sc.nextInt();
            if(menuOption == 1){
                sc.nextLine();
                System.out.print("Enter with item name: ");
                String addItem = sc.nextLine();
                boolean getItem = findItem(groceries, addItem);
                if(!getItem){
                    groceries.add(addItem);
                } else {
                    System.out.println("You've already added this item, try again");
                }
            } else if (menuOption == 2) {
                sc.nextLine();
                System.out.print("Enter with witch item name you want to remove: ");
                String removeItem = sc.nextLine();
                groceries.remove(removeItem);
            }
        } while (menuOption != 0);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        sc.close();
    }

    public static boolean findItem(List<String> itemList, String findItem){
        for(int i = 0; i < itemList.size(); i++){
            itemList.get(i);
            if(itemList.get(i).equals(findItem)){
                return true;
            }
        }
        return false;
    }
}
