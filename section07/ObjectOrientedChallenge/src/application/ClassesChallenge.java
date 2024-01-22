package application;

public class ClassesChallenge {

    public static void main(String[] args) {
        Account c1 = new Account();
        c1.setBalance(1000.00);
        c1.setName("Lázaro");
        c1.setEmail("lazaro@email.com");
        c1.setNumber(81965);

        System.out.println(c1.getBalance());
        c1.withdraw(100.00);
        System.out.println(c1.getBalance());
    }

}
