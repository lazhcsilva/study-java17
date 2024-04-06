package dev.application;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {

    /*

        Criar uma lista de lugares ordenadas por distancia do ponto de partida.
        Usar ListIterator, para andar, tanto para trás como para frente através deste
        itinerário de lugares.
        Primeiro, criar um tipo que tenha um nome de cidade ou lugar, e que um campo para
        armazenar a distancia desde o inicio.
        Em seguida criar um itinerario de lugares ou cidades a serem visitados.
        Ao invés de Strings, você vai querer criar uma LinkedList de seu lugar ou tipo de cidade.
        Sydney deve ser o primeiro lugar da lista.
        Não deve permitir que lugares duplicados estejam em sua lista.
        Deve criar um programa interativo com as seguintes opções de item de menu.
        "
            Available actions (select word or letter):
            (F)orward
            (B)ackward
            (L)ist Places
            (M)enu
            (Q)uit

        "

    */

    private static Scanner sc = new Scanner(System.in);
    private static LinkedList<Place> placesToVisit = new LinkedList<>();

    public static void main(String[] args) {

        Place adelaide = new Place("Adelaide", 1374);
        addPlaces(placesToVisit, adelaide);
        addPlaces(placesToVisit, new Place("adelaide", 1374));
        addPlaces(placesToVisit, new Place("Brisbane", 917));
        addPlaces(placesToVisit, new Place("Perth", 3923));
        addPlaces(placesToVisit, new Place("Alice Springs", 2771));
        addPlaces(placesToVisit, new Place("Darwin", 3972));
        addPlaces(placesToVisit, new Place("Melbourne", 877));

        sortPlacesByDistance(placesToVisit);

        placesToVisit.addFirst(new Place("Sydney", 0));

        System.out.println(placesToVisit);

        Place currentPlace = placesToVisit.getFirst();

        boolean flag = true;
        do {
            menu();
            switch (sc.nextLine()){
                case "F", "Forward" -> foward(placesToVisit, currentPlace);
                case "B", "Backward" -> backward(placesToVisit);
                case "L", "List" -> listPlaces(placesToVisit);
                case "M", "Menu" -> menu();
                case "Q", "Quit" -> flag = false;
                default -> {
                    System.out.println("Option invalid, try again");
                    System.out.println("-".repeat(15));
                }
            }
        } while (flag);
    }

    private static void menu() {
        System.out.println("Available actions (select word or letter)");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");
        System.out.println("-".repeat(15));
        System.out.print("Your option: ");
    }

    private static void foward(LinkedList<Place> list, Place currentPlace) {
        var iterator = list.listIterator();
        if (!iterator.hasNext()){
            System.out.println("No forward place available.");
        } else {
            currentPlace = iterator.next();
            System.out.println("Forward to: " + currentPlace);
        }
//        for (int i = 0; i < list.size(); i++){
//            if (list.get(i) == currentPlace){
//                currentPlace = list.get(i + 1);
//                System.out.println("Current place is -> " + currentPlace);
//                break;
//            }
//        }
        System.out.println("-".repeat(15));
    }

    private static void backward(LinkedList<Place> list) {
        var iterator = list.listIterator();
        if (!iterator.hasPrevious()){

        }
    }

    private static void listPlaces(LinkedList<Place> list) {
        for (Place x : list) {
            System.out.println(x);
        }
        System.out.println("-".repeat(15));
    }

    private static void addPlaces(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if (p.getName().equalsIgnoreCase(place.getName())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace: list) {
            if (place.getDistance() < listPlace.getDistance()) {
                list.add(matchedIndex, place);
                return;
            }

            matchedIndex++;
        }

        list.add(place);
    }

    private static void sortPlacesByDistance(LinkedList<Place> list) {
        Collections.sort(placesToVisit, new Comparator<Place>() {
            @Override
            public int compare(Place o1, Place o2) {
                return o1.getDistance() - o2.getDistance();
            }
        });
    }

}
