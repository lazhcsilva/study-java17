package application;

public class Order {

    private Burger burger;
    private Item drink;
    private Item sideItem;

    public Order(){
        this("regular", "coke", "fries");
    }

    public Order(String burgerType, String drinkType, String sideItemType){
        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new DeluxeBurger(burgerType, 8.5);
        } else {
            this.burger = new Burger(burgerType, 4.00);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.sideItem = new Item("side", sideItemType, 1.50);
    }

    public double getTotalPrice(){
        if(burger instanceof DeluxeBurger){
            return burger.getAdjustedPrice();
        }
        return sideItem.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5){
        if(burger instanceof DeluxeBurger db){
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }

    public void printItemizedList(){
        burger.printItem();
        if(burger instanceof DeluxeBurger){
            Item.printItem(drink.getName(), 0);
            Item.printItem(sideItem.getName(), 0);
        } else {
            drink.printItem();
            sideItem.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

}
