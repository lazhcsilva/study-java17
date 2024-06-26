package application;

public class Account {

    private int number;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double value) {
        balance += value;
        System.out.println("Deposited $" + value);
    }

    public void withdraw(double value) {
        if (value > balance) {
            System.out.println("Negative balance");
        } else {
            balance -= value;
            System.out.println("Withdrawing $" + value);
            System.out.println("New balance $" + balance);
        }
    }
}
