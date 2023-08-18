package d17_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj telefona za proveru: ");
        String brojT = s.next();

        if (!brojT.contains ("+381") || brojT.contains ("/")) {
            System.out.println("Broj nije validan.");
        }





    }
}
