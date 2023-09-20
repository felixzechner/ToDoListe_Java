package main;

import java.util.LinkedList;

/**
 * Die Klasse Edit soll eine bereits vorhandene Aufgabe bearbeiten.
 */
public class Edit {

    /**
     * Die Methode editieren bearbeitet bestimmte Teile einer Aufgabe.
     */
    public void editierenName(LinkedList<String> editNamen, int inputAufgabe, String inputNamen){

        //Ändern des Namen
        editNamen.set(inputAufgabe, inputNamen);
        System.out.println();

        //Nachricht, um den Abschluss des Prozesses zu markieren
        System.out.println();
        System.out.println("Änderungen wurden erfolgreich gespeichert");
    }

    public void editierenDatum(LinkedList<Float> editDatum, int inputAufgabe, float inputDatum){

        //Ändern des Datums
        editDatum.set(inputAufgabe, inputDatum);
        System.out.println();

        //Nachricht, um den Abschluss des Prozesses zu markieren
        System.out.println();
        System.out.println("Änderungen wurden erfolgreich gespeichert");
    }

    public void editierenStatus(LinkedList<String> editStatus, int inputAufgabe, String inputStatus){

        //Ändern des Statuses
        editStatus.set(inputAufgabe, inputStatus);
        System.out.println();

        //Nachricht, um den Abschluss des Prozesses zu markieren
        System.out.println();
        System.out.println("Änderungen wurden erfolgreich gespeichert");
    }
}
