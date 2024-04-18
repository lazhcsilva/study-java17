package dev.application;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<>(500));
        transactions.add(initialDeposit);
    }
}

public class Program {

    /*

        Neste desafio, você precisará criar uma aplicação bancária simples, com um Customer e Bank type.
        O Customer terá um nome e um ArrayList de transações contendo Double wrapper elements.
            * Uma 'constumer's transaction' pode ser um crédito, o que significa um valor positivo, ou
                pode ser um débito e um valor negativo.
        O Bank deve adicionar um novo cliente se ele ainda não estiver na ArrayList.
            * O banco deve adicionar um novo customer, se ele ainda não tiver na lista.
            * O classe do banco deve permitir ao customer adicionar uma transação a um cliente existente.
            * Está classe também deve imprimir uma declaração que inclua o nome do cliente e os valores
                da transação. Este método deve usar unboxing.

    */



    public static void main(String[] args) {

        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A", 500.0);
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("jane A", -10.25);
        bank.printStatement("Jane a");
    }


}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {
        for (var customer: customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if(getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions:");
        for(double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }

}
