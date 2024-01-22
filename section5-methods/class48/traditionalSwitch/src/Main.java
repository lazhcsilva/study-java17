// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        char nato = 'a';

        switch (nato) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("1");
                break;
            case 'f': case 'g': case 'h': case 'i': case 'j':
                System.out.println("2");
                break;
            case 'k': case 'l': case 'm': case 'n': case 'o':
                System.out.println("3");
                break;
            case 'p': case 'q': case 'r': case 's': case 't':
                System.out.println("4");
                break;
            case 'u': case 'v': case 'w': case 'x': case 'y': case 'z':
                System.out.println("5");
                break;
            default:
                System.out.println("6");
                break;
        }

        printDayOfWeek(2);

    }

    public static void printDayOfWeek(int day){
        String dayofWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Sunday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.print(day + " stands for " + dayofWeek);

    }

    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("INVALID");
        }
    }

}