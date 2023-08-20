package d18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        /* Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj)
        ispisuje tablicu mnozenja za taj broj. Resiti for petljom.
         */
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite jednocifren broj x:");
        int x = s.nextInt();

        for (int i = 1; i < 10 ; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
