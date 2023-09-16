package d15_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//Kreirati klasu Karton koja ima:
//tip kartona (crveni, zuti)
//konstuktore za koje mislite da ce vam trebati
//gettere i settere za karton
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

        Igrac igrac = new Igrac("Aki Akic", "1204995123456", 1995, 10, "poluspic", true);

        Karton k1 = new Karton("zuti");
        Karton k2 = new Karton("zuti");
        Karton k3 = new Karton("zuti");
        Karton k4 = new Karton("zuti");
        Karton k5 = new Karton("crveni");

        igrac.dodajKarton(k1);
        igrac.dodajKarton(k2);
        igrac.dodajKarton(k3);
        igrac.dodajKarton(k4);
        igrac.dodajKarton(k5);

        igrac.print();

    }
}
