package appication;

public class Order {

    private Hamburger hamburger;
    private Drink drink;
    private SideItem item;

    public Order(Hamburger hamburger, Drink drink, SideItem item){
        this.hamburger = hamburger;
        this.drink = drink;
        this.item = item;
    }

    public Order(){
        this(new Hamburger("normal"), new Drink("Coke","Small"), new SideItem("Batata-frita"));
    }

}
