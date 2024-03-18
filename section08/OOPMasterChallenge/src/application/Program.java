package application;

public class Program {

    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Hamburger burger = new Hamburger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        Order regularOrder = new Order();
//        regularOrder.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularOrder.setDrinkSize("LARGE");
//        regularOrder.printItemizedList();

//        Order secondOrder = new Order("turkey", "7-up", "chili");
//        secondOrder.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondOrder.setDrinkSize("SMALL");
//        secondOrder.printItemizedList();

        Order deluxeMeal = new Order("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE",
                "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }

}
