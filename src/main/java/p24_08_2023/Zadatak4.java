package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        brojevi.add(4);
        brojevi.add(15);
        brojevi.add(23);
        brojevi.add(36);
        brojevi.add(67);

        System.out.println("Unesite indeks broja iz datog niza (od 0 do 4): ");
        int k = s.nextInt();

        k = brojevi.get(k);

        System.out.println(k);
    }
}
