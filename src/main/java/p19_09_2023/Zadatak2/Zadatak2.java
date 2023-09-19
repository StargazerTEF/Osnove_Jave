package p19_09_2023.Zadatak2;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak2 {

    public static void main(String[] args) {
//U javnom delu klase definisati:
//konstuktore, gettere i settere
//konstruktor koji postavlja ime discipline i tip
//metodu dodaj atleticara u disciplinu
//metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
//(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
//(za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

    Disciplina d1 = new Disciplina("Skok u dalj", "skakacka");
    Disciplina d2 = new Disciplina("Sprint 100m s preponama", "trkacka");

    Skakac s1 = new Skakac("Aki Akic", 8.02);
    Skakac s2 = new Skakac("Pera Zdera", 7.62);
    Skakac prestupio = new Skakac("Zare Zaric", 8.83);
    Trkac t1 = new Trkac("Miki Mikic", 10.13);
    Trkac t2 = new Trkac("Ika Ikic", 10.72);

    d1.dodajAtleticara(s1);
    d1.dodajAtleticara(s2);
    d1.dodajAtleticara(prestupio);
    d2.dodajAtleticara(t1);
    d2.dodajAtleticara(t2);
    d1.diskvalifikujAtleticara("Zare Zaric");

    d1.printNajboljiRezultat();
    d2.printNajboljiRezultat();
    }
}

