import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
//        theMovie.watchMovie();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction," +
                    "or Q to quit): ");
            String type = sc.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }

}
