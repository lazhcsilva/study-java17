package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    /*

        Escrever um método reverso, que toma como parâmetro uma matriz int.
        O método vai permitir que a matriz que está sendo passada seja modificada. Como resultado, este
        método não deve retornar nenhum valor. No método principal, chamar o método inverso e imprimir
        a matriz tanto antes como depois de chamar o método inverso.
        Para inverter a matriz, é preciso torcar os elementos, para uqe o primeiro elemento seja trocado
        com o último, e assim por diante.

    */

    public static void main(String[] args) {
        int[] arrayOriginal = {14, 15, 23, 13, 9};
        System.out.println(Arrays.toString(arrayOriginal));
        reverse(arrayOriginal);

    }

    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("---> " + Arrays.toString(array));
        }
    }

}
