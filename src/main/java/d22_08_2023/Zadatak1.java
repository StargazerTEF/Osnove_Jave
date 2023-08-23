package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
//Na kraju programa ispisati sracunatu sumu.
//Unesite vrednost: 20
//Unesite vrednost: 50
//Unesite vrednost: 50
//Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);

        boolean isSumOverHundred = false;

        int suma = 0;

        while (!isSumOverHundred) {
            System.out.print("Unesite vrednost: ");
            int vrednost = s.nextInt();

            if ((suma + vrednost) > 100) {
                System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma);
                isSumOverHundred = true;
            } else {
                suma = suma + vrednost;
            }
        }
    }
}
