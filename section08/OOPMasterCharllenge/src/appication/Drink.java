package appication;

public class Drink {

    private String type;
    private String size;
    private double price;

    public Drink(String type, String size){
        this.type = type;
        this.size = size;
        this.price = switch (size){
            case "Small" -> 10.0;
            case "Medium" -> 13.0;
            case "Big" -> 15.0;
            default -> 10.0;
        };
    }

    public void SetSize(){
        System.out.println("How big is your drink?");
    }


}
