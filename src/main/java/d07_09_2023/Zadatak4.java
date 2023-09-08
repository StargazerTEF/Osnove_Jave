package d07_09_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//Zadatak 4: Kreiranje klase "Film"
//Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
//U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature.
//Ispisati informacije o filmovima.

        Film a = new Film();
        Film b = new Film();
        Film c = new Film();

        a.naslov = "Space Odyssey 2001";
        a.godina = 1968;
        a.reditelj = "Stanley Kubrick";

        b.naslov = "No Country for Old Men";
        b.godina = 2007;
        b.reditelj = "Cohen brothers";

        c.naslov = "Fight Club";
        c.godina = 1999;
        c.reditelj = "David Fincher";

        System.out.println("Film: " + a.naslov + " izasao " + a.godina + ". reditelj " + a.reditelj);
        System.out.println("Film: " + b.naslov + " izasao " + b.godina + ". reditelj " + b.reditelj);
        System.out.println("Film: " + c.naslov + " izasao " + c.godina + ". reditelj " + c.reditelj);

    }
}
