package appication;

public class SideItem {

    private String type;
    private double price;

    public SideItem(String type){
        this.type = type;
        if(type.equals("Batata-frita")){
            this.price = 5.00;
        } else if (type.equals("Kibe")) {
            this.price = 7.00;
        } else if (type.equals("Yourgute")) {
            this.price = 4.00;
        }
    }

}
