package d07_09_2023;

public class Zadatak5 {
    public static void main(String[] args) {

//Zadatak 5: Kreiranje klase "Oprema"
//Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte
//3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

        Oprema a = new Oprema();
        Oprema b = new Oprema();
        Oprema c = new Oprema();

        a.tip = "patike";
        a.marka = "Nike";
        a.cena = 149.99;

        b.tip = "sorc";
        b.marka = "Addidas";
        b.cena = 39.99;

        c.tip = "majica";
        c.marka = "Champion";
        c.cena = 19.99;

        System.out.println("Oprema: " + a.tip + " " + a.marka + " kosta " + a.cena + " eura.");
        System.out.println("Oprema: " + b.tip + " " + b.marka + " kosta " + b.cena + " eura.");
        System.out.println("Oprema: " + c.tip + " " + c.marka + " kosta " + c.cena + " eura.");

    }
}
