package main;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Die Klasse Main soll die Anwendung ausführen und dient als Sammelpunkt der anderen Klassen.
 */
public class Main {

    /**
     * Die Methode liste beinhaltet die jeweiligen verketteten Listen und gibt diese aus.
     */
    public void liste(String name, float datum, String state){

        //Die Liste besteht aus vier Teilen: dem Index, dem Namen, dem Ablaufdatum und dem Status.

        //Scanner, damit die Eingaben des Benutzers gelesen
        Scanner scanner = new Scanner(System.in);

        //Der Kopf, der dem User beim Start des Programms angezeigt wird
        System.out.println("Hallo! Was möchten Sie machen?");
        System.out.println();
        System.out.println("Aktuelle ToDo-Liste anzeigen: Drücke 1");
        System.out.println("Neue Aufgabe erstellen: Drücke 2");
        System.out.println("Aufgabe bearbeiten: Drücke 3");
        System.out.println("Aufgabe löschen: Drücke 4");
        System.out.println();
        System.out.print("Hier bitte die Zahl eingeben: ");

        //Hier die Liste der Indexnummern
        LinkedList<Integer> id = new LinkedList<>();
        id.add(0);
        id.add(1);
        id.add(id.size());
        id.add(id.size());

        //Hier die Liste der Namen
        LinkedList<String> namen = new LinkedList<>();

        //Daten werden hinzugefügt
        namen.add("Müll wegfahren");
        namen.add("Auto waschen");
        namen.add(name);

        //Hier die Liste der Ablaufdaten
        LinkedList<Float> ablaufdatum = new LinkedList<>();

        //Daten werden hinzugefügt
        ablaufdatum.add(3.6f);
        ablaufdatum.add(5.7f);
        ablaufdatum.add(datum);

        //Hier die Liste der Staten
        LinkedList<String> status = new LinkedList<>();

        //Daten werden hinzugefügt
        status.add("Erledigt");
        status.add("In Arbeit");
        status.add(state);

        //Messen der Nutzereingabe
        int aufgabenauswahl = Integer.parseInt(scanner.next());

        //Objekt der Klasse Add erstellen
        Add add = new Add();

        //Objekt der Klasse Delete erstellen
        Delete delete = new Delete();

        //Objekt der Klasse Edit erstellen
        Edit edit = new Edit();

        //switch case statement, um die richtige Methode ausführen zu können
        switch (aufgabenauswahl) {
            case 1 -> {

                //Hier wird die Tabelle ausgegeben

                //Kopf der Tabelle ausgeben
                System.out.println();
                System.out.println("Hier die aktuelle Liste:");
                System.out.println();
                System.out.println("ID" + " | " + "Name" + " | " + "Ablaufdatum" + " | " + "Status");
                System.out.println();

                //for loop, um die einzelnen LinkedLists im richtigen Format ausgeben zu können
                for(int i = 0; i < id.size() -1; i++){
                    System.out.println(id.get(i) + " | " + namen.get(i) + " | " + ablaufdatum.get(i) + " | " + status.get(i));
                }
                System.out.println();
            }
            case 2 -> {

                //Frage nach dem Namen der Aufgabe
                System.out.println();
                System.out.println("Wie wollen sie die neue Aufgabe heißen?");
                System.out.println();
                String nameNeu = scanner.nextLine();
                nameNeu += scanner.nextLine();

                System.out.println();

                //Frage nach dem Ablaufdatum der Aufgabe
                System.out.println("Bis wann soll diese Aufgabe erledigt werden?");
                System.out.println();
                float datumNeu = Float.parseFloat(scanner.next());

                System.out.println();

                //Frage nach dem Namen der Aufgabe
                System.out.println("Was ist der Status der neuen Aufgabe");
                System.out.println();
                String statusNeu = scanner.nextLine();
                statusNeu += scanner.nextLine();

                System.out.println();

                //Ende des Scans
                scanner.close();

                //Aufrufen der Methode hinzufuegen, um eine Aufgabe hinzufügen zu können
                add.hinzufuegen(namen, ablaufdatum, status, nameNeu, datumNeu, statusNeu);

                //Finde die maximale Größe der Listen
                int maxSize = Math.max(id.size(), Math.max(namen.size(), Math.max(ablaufdatum.size(), status.size())));

                System.out.println("Hier die aktualisierte Liste:");
                System.out.println();

                //Kopf der Tabelle ausgeben
                System.out.println("ID" + " | " + "Name" + " | " + "Ablaufdatum" + " | " + "Status");
                System.out.println();

                for(int i = 0; i < maxSize; i++){
                    Integer valueId = i < id.size() ? id.get(i) : null;
                    String valueName = i < namen.size() ? namen.get(i) : null;
                    Float valueDatum = i < ablaufdatum.size() ? ablaufdatum.get(i) : null;
                    String valueStatus = i < status.size() ? status.get(i) : null;

                    System.out.println(valueId + " | " + valueName + " | " + valueDatum + " | " + valueStatus);
                }

            }
            case 3 -> {

                //Finde die maximale Größe der Listen
                int maxSize = Math.max(id.size()-1, Math.max(namen.size()-1, Math.max(ablaufdatum.size()-1, status.size()-1)));
                System.out.println();

                System.out.println("Hier die aktuelle Liste:");
                System.out.println();

                //Kopf der Tabelle ausgeben
                System.out.println("ID" + " | " + "Name" + " | " + "Ablaufdatum" + " | " + "Status");
                System.out.println();

                for(int i = 0; i < maxSize; i++){
                    Integer valueId = i < id.size() ? id.get(i) : null;
                    String valueName = i < namen.size() ? namen.get(i) : null;
                    Float valueDatum = i < ablaufdatum.size() ? ablaufdatum.get(i) : null;
                    String valueStatus = i < status.size() ? status.get(i) : null;

                    System.out.println(valueId + " | " + valueName + " | " + valueDatum + " | " + valueStatus);
                }

                System.out.println();
                System.out.print("Geben Sie bitte die ID der Aufgabe ein, den Sie bearbeiten wollen: ");

                //Variable, um speichern zu können, welche Aufgabe bearbeitet wird
                int editAufgabe = Integer.parseInt(scanner.next());
                System.out.println();

                //Frage, welcher Teil der Aufgabe bearbeitet werden soll
                System.out.println();
                System.out.println("Welchen Teil der Aufgabe wollen Sie bearbeiten");
                System.out.println();
                System.out.println("Name: Drücke 1");
                System.out.println("Datum: Drücke 2");
                System.out.println("Status: Drücke 3");
                System.out.println();

                //Variable, um speichern zu können, welchen Teil der Aufgabe man bearbeiten will
                int editSpalte = Integer.parseInt(scanner.next());
                System.out.println();

                //switch case, um den richtigen Datentyp für den Wert zu haben
                switch (editSpalte) {
                    case 1 -> {

                        //Case, um den Wert Namen zu verändern
                        System.out.println("Was soll der neue Name sein?");
                        System.out.println();

                        //Neuer Name wird gespeichert
                        String inputNamen = scanner.next();

                        //Aufrufen der Methode bearbeiten, um eine Aufgabe bearbeiten zu können
                        edit.editierenName(namen, editAufgabe, inputNamen);
                        System.out.println();
                    }
                    case 2 -> {

                        //Case, um den Wert Datum zu verändern
                        System.out.println("Was ist das neue Datum?");

                        //Neues Datum wird gespeichert
                        float inputDatum = Float.parseFloat(scanner.next());

                        edit.editierenDatum(ablaufdatum, editAufgabe, inputDatum);
                    }
                    case 3 -> {

                        //Case, um den Wert Status zu verändern
                        System.out.println("Was ist der neue Status?");
                        System.out.println();

                        //Neuer Status wird gespeichert
                        String inputStatus = scanner.next();

                        edit.editierenStatus(status, editAufgabe, inputStatus);

                    }
                    default -> {

                        //Default Case, falls keine passende Zahl eingegeben wird
                        System.out.println("Keine Kategorie für diesen Wert vorhanden.");
                        System.out.println();

                    }
                }
            }
            case 4 -> {

                //Ausgabe der Aufgabenliste

                //Finde die maximale Größe der Listen
                int maxSize = Math.max(id.size(), Math.max(namen.size(), Math.max(ablaufdatum.size(), status.size())));
                System.out.println();

                System.out.println("Hier die aktuelle Liste:");
                System.out.println();

                //Kopf der Tabelle ausgeben
                System.out.println("ID" + " | " + "Name" + " | " + "Ablaufdatum" + " | " + "Status");
                System.out.println();

                for(int i = 0; i < maxSize; i++){
                    Integer valueId = i < id.size() ? id.get(i) : null;
                    String valueName = i < namen.size() ? namen.get(i) : null;
                    Float valueDatum = i < ablaufdatum.size() ? ablaufdatum.get(i) : null;
                    String valueStatus = i < status.size() ? status.get(i) : null;

                    System.out.println(valueId + " | " + valueName + " | " + valueDatum + " | " + valueStatus);
                }

                //Frage an den Nutzer, welche Aufgabe gelöscht werden soll
                System.out.println();
                System.out.print("Geben Sie bitte die ID der Aufgabe ein, die Sie löschen möchten: ");

                //Erstellen der Variable, die den vom Nutzer eingegeben Wert zwischenspeichert
                int deleteID = Integer.parseInt(scanner.next());

                //Aufrufen der Methode loeschen, um eine Aufgabe löschen zu können
                delete.loeschen(id, namen, ablaufdatum, status, deleteID);
                System.out.println();

                System.out.println("Hier die aktualisierte Liste:");
                System.out.println();

                //Kopf der Tabelle ausgeben
                System.out.println("ID" + " | " + "Name" + " | " + "Ablaufdatum" + " | " + "Status");
                System.out.println();

                for(int i = 0; i < maxSize; i++){
                    Integer valueId = i < id.size() ? id.get(i) : null;
                    String valueName = i < namen.size() ? namen.get(i) : null;
                    Float valueDatum = i < ablaufdatum.size() ? ablaufdatum.get(i) : null;
                    String valueStatus = i < status.size() ? status.get(i) : null;

                    System.out.println(valueId + " | " + valueName + " | " + valueDatum + " | " + valueStatus);
                }

                System.out.println();
                System.out.println("Die Änderungen wurden erfolgreich gespeichert.");
            }
            default -> {

                //Default case, falls eine Zahl außerhalb von 1 bis 4 eingegeben wurde
                System.out.println("Keine Aktion unter dieser Nummer. Tut mir leid");
                System.out.println();
            }
        }
    }

    /**
     * Die Methode main führt das Programm bzw. die Anweisungen aus.
     */
    public static void main(String[] args) {

        //Objekt der Klasse Main erstellen
        Main main = new Main();

        //Methode "liste" wird aufgerufen
        main.liste("Beispielname", 1.1f,"Beispielstatus");
    }
}
