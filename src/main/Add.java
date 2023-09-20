package main;

import java.util.LinkedList;

/**
 * Die Klasse Add soll eine Aufgabe zu der Liste hinzufügen.
 */
public class Add {

    /**
     * Die Methode add soll, wenn der Nutzer die richtige Zahl eingegeben hat, sollen die jeweiligen Daten in den jeweiligen Listen gespeichert werden.
     */
    public void hinzufuegen(LinkedList<String> list1, LinkedList<Float> list2, LinkedList<String> list3, String name, Float datum, String status){

        //Hinzufügen des Namen
        list1.add(name);

        //Hinzufügen des Datums
        list2.add(datum);

        //Hinzufügen des Statuses
        list3.add(status);

        //Bestätigung, dass die Aufgabe erfolgreich gespeichert wurde
        System.out.println("Die Aufgabe wurde erfolgreich gespeichert.");
        System.out.println();

    }
}
