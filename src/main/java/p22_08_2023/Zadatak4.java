package p22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean play = false;

        int zvuk = 75;

        while (!play) {
            System.out.print("Unesite akciju: ");
            String akcija = s.next();

            if (akcija.equals("pojacaj")) {
                zvuk += 10;
            } else if (akcija.equals("smanji")) {
                zvuk -= 10;
            }
            if ((akcija.equals("pojacaj")) && (zvuk > 90)) {
                zvuk = 100;
            }
            if ((akcija.equals("smanji")) && (zvuk < 10)) {
                zvuk = 0;
            }
            if (akcija.equals("play"))
                play = true;
        }
        System.out.println("Jacina zvuka je " + zvuk + ".");
    }
}
