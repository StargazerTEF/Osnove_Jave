package d07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//Zadatak 2: Kreiranje klase "Automobil"
//Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
//U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

        Automobil a = new Automobil();
        Automobil b = new Automobil();
        Automobil c = new Automobil();

        a.marka = "Ford";
        a.model = "Mustang";
        a.godiste = 2013;

        b.marka = "Golf";
        b.model = "Dvojka";
        b.godiste = 2000;

        c.marka = "Citroen";
        c.model = "C4";
        c.godiste = 2010;

        System.out.println("Automobil: " + a.marka + " marka " + a.model + " godiste " + a.godiste + ".");
        System.out.println("Automobil: " + b.marka + " marka " + b.model + " godiste " + b.godiste + ".");
        System.out.println("Automobil: " + c.marka + " marka " + c.model + " godiste " + c.godiste + ".");

    }
}
