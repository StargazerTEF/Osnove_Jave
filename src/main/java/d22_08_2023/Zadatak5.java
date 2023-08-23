package d22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//  Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu
//  sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju
//  programa se ispisuje da li su sve zagrade uparene.
//	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//	Primer izvrsenja:                                       Primer izvrsenja 2:
//	Unos: (                                                 Unos: (
//	Unos: 2                                                 Unos: 2
//	Unos: *                                                 Unos: *
//	Unos: (                                                 Unos: (
//	Unos: 1                                                 Unos: 1
//	Unos: +                                                 Unos: +
//	Unos: 3                                                 Unos: 3
//	Unos: )                                                 Unos: )
//	Unos: )                                                 Unos: =
//	Unos: =                                                 Zagrade nisu uparene
//	Zagrade su uparene                                      (Objasnjenje: fali poslednja
//	(Objasnjenje: Imamo isti broj otvorenih                 zagrada iz formule)
//	i zatvorenih zagrada)

        Scanner s = new Scanner(System.in);

        int otvoreneZagrade = 0;
        int zatvoreneZagrade = 0;
        boolean kraj = false;

        while (!kraj) {
            System.out.print("Unos: ");
            String unos = s.next();

            if (unos.equals("(")) {
                otvoreneZagrade++;
            }
            if (unos.equals(")")) {
                zatvoreneZagrade++;
            }
            if (unos.equals("=") && otvoreneZagrade == zatvoreneZagrade && otvoreneZagrade != 0) {
                kraj = true;
                System.out.println("Zagrade su uparene.");
            } else if (unos.equals("=") && otvoreneZagrade != zatvoreneZagrade) {
                kraj = true;
                System.out.println("Zagrade nisu uparene.");
            }
        }
    }
}
