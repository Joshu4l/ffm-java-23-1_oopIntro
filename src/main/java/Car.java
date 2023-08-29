// Erstellt gemeinsam eine Klasse 'Auto', die Eigenschaften und Methoden eines Autos repräsentiert.
//Schritt 1: Definiert die Eigenschaften eines Autos, z.B. 'Marke', 'Modell', 'Farbe', 'Baujahr', usw.
//Schritt 2: Implementiert eine Methode, die das Auto startet und eine Nachricht ausgibt.
//Schritt 3: Erstellt ein Objekt der Klasse 'Auto' und ruft die Methode zum Starten auf.
//Schritt 4: Erweitert die Klasse 'Auto' um eine Methode, die das Auto beschleunigt und die Geschwindigkeit ändert.
//Schritt 5: Erstellt ein zweites Objekt der Klasse 'Auto', beschleunigt es und gebt die Geschwindigkeit aus.
//Falls ihr diese Aufgabe bereits früher abgeschlossen habt, dürft ihr die Bonusaufgabe auf der nächsten Seite bearbeiten.

public class Car {

    String brand;
    String model;
    String color;
    int yearOfConstruction;
    int initialPosition;
    int velocity;

    // CONSTRUCTOR:
    Car (String brand, String model, String color, int yearOfConstruction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfConstruction = yearOfConstruction;
        this.initialPosition = 0; // default without requiring the user to define it
        this.velocity = 0; // default without requiring the user to define it
    }

    // METHODS:
    public void startCar () {
        System.out.println("*wroomm* The " + brand + " " + model + " has been started.");
    }

    public void accelerate(int velocityInKMH) {
        this.velocity = velocityInKMH;
        System.out.println("*wwhhhh* The " + brand + " " + model + " is driving with " + velocityInKMH + " km/h.");
    }

}
