package application;

public class Program {

    public static void main(String[] args) {

        Employee mark = new Employee("Mark", "11/08/1995", 00002, "01/02/2020");
        System.out.println(mark);
        System.out.println("Age = " + mark.getAge());


        SalariedEmployee lazaro = new SalariedEmployee("Lazaro", "08/07/1991",
                00001, "15/07/2020", 4000.0);

        lazaro.retire();

        System.out.println(lazaro);

    }

}
