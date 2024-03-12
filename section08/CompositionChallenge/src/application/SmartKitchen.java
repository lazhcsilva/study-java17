package application;

public class SmartKitchen {

    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public void addWater(){}

    public void pourMilk(){}

    public void loadDishWater(){}

    public void setKitchenState(boolean coffeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}
