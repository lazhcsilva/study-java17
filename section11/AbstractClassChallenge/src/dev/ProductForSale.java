package dev;

public abstract class ProductForSale{

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void printPriceItem(int qty) {
        System.out.printf("%2d qty at $%8.2f each, %-15s %n",
                qty, price, type, description);
    }

    public double getSalesPrice(int qty) {
        return price * qty;
    }

    public abstract void showDetails();

}
