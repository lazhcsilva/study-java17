package application;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("lazaro", "lazaro@email.com");
    }

    public Customer(String nome, String email) {
        this(nome, 1000.00, email);
    }

}
