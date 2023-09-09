package d08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda
//kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod a = new Proizvod();
        Proizvod b = new Proizvod();

        a.naziv = "knjiga";
        a.cena = 499.99;
        a.tezina = 650;

        b.naziv = "dres";
        b.cena = 3999.99;
        b.tezina = 150;

        a.stampaj();
        b.stampaj();

        a.povecajCenu(25);
        b.povecajCenu(100);

        a.stampaj();
        b.stampaj();

        double x = a.vratiCenuSaPopustom(15);
        double y = b.vratiCenuSaPopustom(10);

        System.out.println("Cena proizvoda " + a.naziv + " nakon popusta iznosi " + x + "rsd.");
        System.out.println("Cena proizvoda " + b.naziv + " nakon popusta iznosi " + y + "rsd.");

        int p = a.racunajPostarinu();
        int q = b.racunajPostarinu();

        System.out.println("Postarina za " + a.naziv + " iznosi " + p + "rsd.");
        System.out.println("Postarina za " + b.naziv + " iznosi " + q + "rsd.");

    }
}
