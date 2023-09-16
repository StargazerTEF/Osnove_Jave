package d15_09_2023.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

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
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere.
//Podatke za igrace i trenere unosi korisnik sa tastature.

            Scanner s = new Scanner(System.in);
            ArrayList<Igrac> igraci = new ArrayList<>();
            ArrayList<Trener> treneri = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime igraca: ");
            String ime = s.next();
            System.out.print("Unesite prezime igraca: ");
            String prezime = s.next();
            System.out.print("Unesite jmbg igraca: ");
            String jmbg = s.next();
            System.out.print("Unesite godiste igraca: ");
            int godRodjenja = s.nextInt();
            System.out.print("Unesite broj dresa igraca: ");
            int brDresa = s.nextInt();
            System.out.print("Unesite poziciju igraca: ");
            String pozicija = s.next();
            System.out.print("Unesite da li je igrac kapiten: ");
            boolean kapiten = s.nextBoolean();
            Igrac igrac = new Igrac(ime + " " + prezime, jmbg, godRodjenja, brDresa, pozicija, kapiten);
            igraci.add(igrac);
        }
        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime trenera: ");
            String ime = s.next();
            System.out.print("Unesite prezime trenera: ");
            String prezime = s.next();
            System.out.print("Unesite jmbg trenera: ");
            String jmbg = s.next();
            System.out.print("Unesite godiste trenera: ");
            int godRodjenja = s.nextInt();
            System.out.print("Unesite godine iskustva trenera: ");
            int godIskustva = s.nextInt();
            System.out.print("Unesite tip trenera: ");
            String tip = s.next();
            Trener trener = new Trener(ime + " " + prezime, jmbg, godRodjenja, godIskustva, tip);
            treneri.add(trener);
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            igraci.get(i).print();
        }
        for (int i = 0; i < 2; i++) {
            treneri.get(i).print();
        }
    }
}
