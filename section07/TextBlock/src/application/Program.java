package application;

public class Program {

    public static void main(String[] args) {

        String bulletIt = "Print a Bullet List:\n" +
                "\t\u2022 First point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                        Print a text block:
                        \u2022 First point
                            \u2022 Sub point
                """;

        System.out.println(textBlock);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }
    }

}
