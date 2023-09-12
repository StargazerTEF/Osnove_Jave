package p12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        ArrayList<Sastojak> sastojci = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        sastojci.add(new Sastojak("secer", 100));
        sastojci.add(new Sastojak("brasno", 79));
        sastojci.add(new Sastojak("jaja", 120));

        System.out.print("Unesite broj N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite sledeci sastojak: ");
            String sastojak = s.next();
            System.out.print("Unesite cenu: ");
            int cena = s.nextInt();
            sastojci.add(new Sastojak(sastojak, cena));
        }
        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println("Sastojak: " + sastojci.get(i).getName() + " - cena " + sastojci.get(i).getCena() + "rsd.");
        }
    }
}
