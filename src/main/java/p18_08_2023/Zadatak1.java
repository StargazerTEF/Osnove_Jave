package p18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite promenljivu n: ");
        int n = s.nextInt();

        System.out.println("Uneti operaciju: ");
        String akcija = s.next();

        if (akcija.equals("uvecaj")) {
            n = n + 1;
        }
        if (akcija.equals("umanji")){
            n = n - 1;
        }
        System.out.println("Nova vrednost za n je " + n);


    }
}
