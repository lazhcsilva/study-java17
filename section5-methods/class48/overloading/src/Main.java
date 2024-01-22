// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double value = convertToCentimeters(68);
        System.out.println(value);

        double valueB = convertToCentimeters(5, 8);
        System.out.println(valueB);

    }

    public static double convertToCentimeters(int inches) {
        return 2.54 * inches;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * 12) + inches);
    }

}