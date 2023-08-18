package dom17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

         /* Napisati program koji ima informacije koje ucitava sa tastature:
        - Ime
        - Prezime
        - Godinu rodjenja
        I stampa informacije u formatu [Ime] [Prezime] - [starost] god
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite godiste: ");
        int godiste = s.nextInt();

        int godina = 2023;

        int brojGodina = godina - godiste;

        System.out.println(ime + " " + prezime + " - " + brojGodina + " god");





    }
}
