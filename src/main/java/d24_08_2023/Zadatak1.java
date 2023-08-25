package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//Napisati program koji u sebi ima definisan niz od 10 brojeva (brojevi su proizvoljni) i
//koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(11);
        numbers.add(13);
        numbers.add(17);
        numbers.add(23);
        numbers.add(31);
        numbers.add(37);
        numbers.add(43);

        System.out.print("Unesite poziciju od 0 do 9: ");
        int k = s.nextInt();

        System.out.print("Unesite novu vrednost: ");
        int value = s.nextInt();

        numbers.set(k, value);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
        }
    }
}
