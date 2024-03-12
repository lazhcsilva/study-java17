package appication;

import static appication.Program.sc;

public class Hamburger {

    private String type;
    private double price;
    private int coverage;

    public Hamburger(String type){
        this.type = type;

        setPrice();
    }

    public double setCoverage(){
        System.out.println("Do you want coverage?");
        String answerCoverage = sc.nextLine();
        if(answerCoverage.equals("Yes")){
            int quantityCoverage = 0;
            while (quantityCoverage <= 1 || quantityCoverage >= 3){
                System.out.println("You can only choose from 1 to 3 covers");
                System.out.println("How much coverage you want?");
                quantityCoverage = sc.nextInt();
            }
            coverage = quantityCoverage;
        } else {
            System.out.println("You don't added coverage");
            coverage = 0;
        }
        return coverage;
    }

    public double burguerPrice(){
        double burguer = 0;
        if (type.equals("Small")){
            burguer = 15.00;
        } else if (type.equals("Medium")) {
            burguer = 20.00;
        } else if (type.equals("Big")){
            burguer = 25.00;
        }
        return burguer;
    }

    public double setPrice(){
        double valueCoverage = setCoverage() * 3;
        double valueTotal = burguerPrice();
        return this.price = valueTotal + valueCoverage;
    }

    public void hamburguerPremium(){
        this.coverage += 2;
    }


    @Override
    public String toString() {
        return "Hamburger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", coverage=" + coverage +
                '}';
    }
}
