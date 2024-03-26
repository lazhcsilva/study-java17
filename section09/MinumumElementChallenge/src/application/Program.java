package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    /*
        Escreva um método chamado readIntegers, que lê uma lista de números delimitada
        por virgulas, inserida pelo usuário a partir do console e então retorna um array,
        contendo aqueles números que foram inseridos.
        Em seguida, escreva um método chamado findMin, que toma a matriz como argumento
        e retorna o valor mimimo encontrado nesse array.
        No método principal, chame o método readIntegers, para obter o conjuntos de inteiros
        do usuário, e imprima-os, usando um metodo encontrado em java.util.Arrays.
        Deṕos, chame o metodo findMin, passando o array, retornando da chamada do metodo
        readIntegers.
        Imprimir o elemento minumo no array, que deve ser devolvido pelo método findMin.

        Uma dica: Assumir que o usuário só digitará números, assim você não precisa fazer qualquer
        validação para a entrada do console.
    */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] value = readIntegers();
        System.out.println(Arrays.toString(value));
        int minArray = findMin(value);
        System.out.println(minArray);
    }

    private static int[] readIntegers(){
        String inputValue = sc.nextLine();
        String[] elements = inputValue.split(",");
        int[] values = new int[elements.length];

        for(int i = 0; i < elements.length; i++){
            values[i] = Integer.parseInt(elements[i].trim());
        }

        return values;
    }

    private static int findMin(int[] number){
        Arrays.sort(number);
        return number[0];
    }

}
