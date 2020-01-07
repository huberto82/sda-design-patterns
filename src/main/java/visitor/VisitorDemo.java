package visitor;

/**
 * Taxi - interfejs obiektów - aut, które oddają kontrolę wizytatorowi - pasażerowi
 * Passenger - interfejs obiektów - pasażerów, którzy wsiadają do auta i wydają dyspozycje
 * Car - Klasa obiektu, który będzie sterowany przez wizytatora - turystę
 * Vip, Tourist - Klasy obiektów pasażerów, którzy będą "sterować" autem
 */

public class VisitorDemo {
    public static void main(String[] args) {
        Vip kubica = new Vip("Kubica", "18763847264A");
        Car taxi = new Car(1000);
        Tourist kowalski = new Tourist(12);
        //auto zachowuje się zgodnie z wolą pasażera
        taxi.acceptPassenger(kubica);
        taxi.acceptPassenger(kowalski);
    }
}
