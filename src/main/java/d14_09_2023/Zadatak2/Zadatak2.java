package d14_09_2023.Zadatak2;

import java.util.Collections;

public class Zadatak2 {
    public static void main(String[] args) {

//Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. Znaci nije vam potrebna provera za opseg brojeva.
//Za potrebe Lotto igre na srecu potrebno je
//Kreirati klasu Kombinacija koja ima:
//id kombinacije (String)
//niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//Zaglavlje metode je:
//public boolean daLiJeIstaKombinacija( Kombinacija k)
//metoda vraca true ako su svi elementi na istim pozicija isti
//npr: this [0] == k [0], this [1] == k [1] ….
//metodu za stampu koja stampa podatke u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//Kreirati klasu Listic koja ima:
//niz kombinacija - maksimalno 7 kombinacija
//metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji
//prosledjena kombinacija. Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//Zaglavlje metode
//public boolean dobitna(Kombinacija dobitnaKombinacija)
//metodu koja stampa listic u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//…… i tako za sve kombinacije

        Kombinacija k1 = new Kombinacija("k1", 1, 3, 4, 14, 16, 23, 38);
        Kombinacija k2 = new Kombinacija("k2", 1, 2, 7, 15, 18, 22, 33);
        Kombinacija k3 = new Kombinacija("k3", 4, 5, 13, 16, 19, 25, 32);
        Kombinacija k4 = new Kombinacija("k4", 9, 13, 14, 24, 26, 33, 38);
        Kombinacija k5 = new Kombinacija("k5", 5, 13, 24, 25, 26, 32, 39);
        Kombinacija k6 = new Kombinacija("k6", 7, 18, 21, 23, 24, 34, 35);
        Kombinacija k7 = new Kombinacija("k7", 3, 6, 9, 18, 21, 27, 36);

        Kombinacija dobitna = new Kombinacija("dobitnaKombinacija", 2, 6, 9, 18, 21, 27, 36);

        Listic l1 = new Listic();
        l1.dodajKombinaciju(k1);
        l1.dodajKombinaciju(k2);
        l1.dodajKombinaciju(k3);
        l1.dodajKombinaciju(k4);
        l1.dodajKombinaciju(k5);
        l1.dodajKombinaciju(k6);
        l1.dodajKombinaciju(k7);

        l1.print();
        dobitna.print();
        System.out.println();

        System.out.println("Dobitna kombinacija je " + l1.kojaJeKombinacijaDobitna(dobitna));

        boolean x = l1.daLiJeKombinacijaDobitna(dobitna);
        if (x) {
            System.out.println("Cestitamo, vi ste srecni dobitnik, posedujete dobitnu kombinaciju.");
        } else {
            System.out.println("Nazalost, nemate dobitnu kombinaciju.");
        }
    }
}
