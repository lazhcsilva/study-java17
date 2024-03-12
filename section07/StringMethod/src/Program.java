public class Program {

    public static void main(String[] args) {

        String birthDate = "07/08/1991";
        int startingIndex = birthDate.indexOf("1991");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

    }

}
