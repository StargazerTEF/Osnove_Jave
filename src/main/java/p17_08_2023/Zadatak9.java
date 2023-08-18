package d17_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Uneti znak karte koja je na stolu: ");
        String znakS = s.next();

        System.out.println("Uneti broj karte koja je na stolu: ");
        String brojS = s.next();

        System.out.println("Uneti znak karte koju igrac zeli da odigra: ");
        String znakO = s.next();

        System.out.println("Uneti broj karte koju igrac zeli da odigra: ");
        String brojO = s.next();

        if (znakS.equals(znakO) || brojS.equals(brojO)) {
            System.out.println("Potez je validan.");
        } else {
            System.out.println("Potez je nevalidan.");
        }





    }
}
