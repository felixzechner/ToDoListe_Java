package test;

import main.Delete;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * Die Klasse DeleteTest testet, ob die Klasse Delete auch richtig funktioniert.
 */

public class DeleteTest {

    /**
     * Die Methode loeschenTest testet, ob die Methode loeschen richtig funktioniert.
     */

    @Test
    public void loeschenTest(){

        //Erstellen einer Instanz von Delete
        Delete delete = new Delete();

        //Erstellen von LinkedLists zum Testen
        LinkedList<Integer> idListeTest = new LinkedList<>();
        LinkedList<String> nameListeTest = new LinkedList<>();
        LinkedList<Float> datumListeTest = new LinkedList<>();
        LinkedList<String> statusListeTest = new LinkedList<>();

        //Zuweisen von Werten zu den Listen
        idListeTest.add(0);
        idListeTest.add(1);
        nameListeTest.add("Programmieren lernen");
        nameListeTest.add("Fußball spielen");
        datumListeTest.add(1.3f);
        datumListeTest.add(4.6f);
        statusListeTest.add("In Arbeit");
        statusListeTest.add("Erledigt");

        //Führe die Methode loeschen aus
        delete.loeschen(idListeTest, nameListeTest, datumListeTest, statusListeTest, 1);

        //Überprüfe, ob die Elemente aus der Liste gelöscht wurden
        Assertions.assertTrue(idListeTest.contains(0));
        Assertions.assertTrue(nameListeTest.contains("Programmieren lernen"));
        Assertions.assertTrue(datumListeTest.contains(1.3f));
        Assertions.assertTrue(statusListeTest.contains("In Arbeit"));



    }
}
