package dev.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> groceries = new ArrayList<>();
        boolean showActions = true;

        do {
            printActions();
            switch (Integer.parseInt(sc.nextLine())){
                case 1 -> addItem(groceries);
                case 2 -> removeItem(groceries);
                default -> showActions = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        } while (showActions);
        sc.close();
    }

    private static void printActions(){
        System.out.println("Available actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list");
        System.out.print("Enter a number for which action you want to do: ");
    }

    private static void addItem(List<String> groceries){
        System.out.print("Enter with item name: ");
        String addItem = sc.nextLine();

        if(!groceries.contains(addItem)){
            groceries.add(addItem);
        }
    }

    private static void removeItem(List<String> groceries){
        System.out.print("Enter with witch item name you want to remove: ");
        String removeItem = sc.nextLine();
        groceries.remove(removeItem);
    }

}
