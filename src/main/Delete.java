package main;

import java.util.LinkedList;

/**
 * Die Klasse Delete soll eine Aufgabe aus der Liste entfernen.
 */
public class Delete {

    /**
     * Die Methode editieren bearbeitet bestimmte Teile einer Aufgabe.
     */
    public void loeschen(LinkedList<Integer> deleteID, LinkedList<String> deleteName, LinkedList<Float> deleteDatum, LinkedList<String> deleteStatus,int id){


        //Entfernen des ID-Wertes
        deleteID.remove(id);

        //Hinzufügen des Namen
        deleteName.remove(id);

        //Hinzufügen des Datums
        deleteDatum.remove(id);

        //Hinzufügen des Statuses
        deleteStatus.remove(id);

    }
}
