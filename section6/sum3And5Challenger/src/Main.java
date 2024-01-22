// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int number = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("The number " + i + " is divisible for 3 and 5");
                sum += i;
                number++;
                if (number == 5) {
                    System.out.println("The sum of all number is " + sum);
                    break;
                }
            }

        }

    }
}