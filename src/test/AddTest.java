package test;

import main.Add;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * Die Klasse AddTest testet, ob die Klasse Add richtig funktioniert.
 */

public class AddTest {

    /**
     * Die Methode hinzufuegenTest testet, ob die Methode hinzufuegen richtig funktioniert.
     */
    @Test
    public void hinzufuegenTest(){

        //Erstellen einer Instanz von Add
        Add add = new Add();

        //Erstellen von LinkedLists für den Test

        LinkedList<String> nameListeTest = new LinkedList<>();
        LinkedList<Float> datumListeTest = new LinkedList<>();
        LinkedList<String> statusListeTest = new LinkedList<>();

        //Führe die Methode hinzufuegen aus
        add.hinzufuegen(nameListeTest, datumListeTest, statusListeTest, "Spiel", 3.4f, "Erledigt");

        //Überprüfe, ob die Elemente in den Listen vorhanden sind
        Assertions.assertTrue(nameListeTest.contains("Spiel"));
        Assertions.assertTrue(datumListeTest.contains(3.4f));
        Assertions.assertTrue(statusListeTest.contains("Erledigt"));

    }
}
