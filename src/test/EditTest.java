package test;

import main.Edit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * Die Klasse EditTest testet, ob die Klasse Edit funktioniert.
 */

public class EditTest {

    /**
     * Die Methode editierenNameTest testet, ob die Methode editierenName funktioniert.
     */

    @Test
    public void editierenNameTest(){

        //Erstellen einer Instanz
        Edit edit = new Edit();

        //Erstellen von LinkedLists zum Testen
        LinkedList<String> nameListeTest = new LinkedList<>();
        LinkedList<Float> datumListeTest = new LinkedList<>();
        LinkedList<String> statusListeTest = new LinkedList<>();

        //Zuweisen von Werten zu den Listen
        nameListeTest.add("Programmieren lernen");
        datumListeTest.add(1.3f);
        statusListeTest.add("In Arbeit");

        //Führe die Methode editieren aus
        edit.editierenName(nameListeTest, 0, "Laufen");

        //Überprüfe, ob das richtige Elemente editiert wurde
        Assertions.assertTrue(nameListeTest.contains("Laufen"));
        Assertions.assertTrue(datumListeTest.contains(1.3f));
        Assertions.assertTrue(statusListeTest.contains("In Arbeit"));

    }

    /**
     * Die Methode editierenDatumTest testet, ob die Methode editierenDatum funktioniert.
     */

    @Test
    public void editierenDatumTest(){

        //Erstellen einer Instanz
        Edit edit = new Edit();

        //Erstellen von LinkedLists zum Testen
        LinkedList<String> nameListeTest = new LinkedList<>();
        LinkedList<Float> datumListeTest = new LinkedList<>();
        LinkedList<String> statusListeTest = new LinkedList<>();

        //Zuweisen von Werten zu den Listen
        nameListeTest.add("Programmieren lernen");
        datumListeTest.add(1.3f);
        statusListeTest.add("In Arbeit");

        //Führe die Methode editieren aus
        edit.editierenDatum(datumListeTest, 0, 1.5f);

        //Überprüfe, ob das richtige Elemente editiert wurde
        Assertions.assertTrue(nameListeTest.contains("Programmieren lernen"));
        Assertions.assertTrue(datumListeTest.contains(1.5f));
        Assertions.assertTrue(statusListeTest.contains("In Arbeit"));

    }

    /**
     * Die Methode editierenStatusTest testet, ob die Methode editierenStatus funktioniert.
     */

    @Test
    public void editierenStatusTest(){

        //Erstellen einer Instanz
        Edit edit = new Edit();

        //Erstellen von LinkedLists zum Testen
        LinkedList<String> nameListeTest = new LinkedList<>();
        LinkedList<Float> datumListeTest = new LinkedList<>();
        LinkedList<String> statusListeTest = new LinkedList<>();

        //Zuweisen von Werten zu den Listen
        nameListeTest.add("Programmieren lernen");
        datumListeTest.add(1.3f);
        statusListeTest.add("In Arbeit");

        //Führe die Methode editieren aus
        edit.editierenStatus(statusListeTest, 0, "Erledigt");

        //Überprüfe, ob das richtige Elemente editiert wurde
        Assertions.assertTrue(nameListeTest.contains("Programmieren lernen"));
        Assertions.assertTrue(datumListeTest.contains(1.3f));
        Assertions.assertTrue(statusListeTest.contains("Erledigt"));

    }
}
