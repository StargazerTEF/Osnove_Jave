package d07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

//Zadatak 3: Kreiranje klase "Proizvod"
//Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte
//3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

        Proizvod a = new Proizvod();
        Proizvod b = new Proizvod();
        Proizvod c = new Proizvod();

        a.naziv = "olovka";
        a.cena = 52.49;

        b.naziv = "zvake";
        b.cena = 109.99;

        c.naziv = "upaljac";
        c.cena = 79.99;

        System.out.println("Proizvod: " + a.naziv + " cena " + a.cena + " rsd");
        System.out.println("Proizvod: " + b.naziv + " cena " + b.cena + " rsd");
        System.out.println("Proizvod: " + c.naziv + " cena " + c.cena + " rsd");

    }
}
