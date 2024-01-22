// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int hours = minutes / 60;
        System.out.println("Hours = " + hours);

        int hours1 = seconds / 3600;
        System.out.println("Hours1 = " + hours1);
        return null;
    }

    public static String getDurationString(int minutes, int seconds) {
        return null;
    }

}