package appication;

import java.util.Scanner;

public class Program {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Do you want a standard or customized meal?");
        String meal = sc.nextLine();

        if(meal.equals("Yes")){
            System.out.println("Test");
        } else {
            Order defaultOrder = new Order();
            System.out.println("Your meal is ready!");
            System.out.println(defaultOrder);
        }

    }

}
