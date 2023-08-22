package p22_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int vrednost = 0;
        int suma = 0;
        boolean kraj = false;

        while (!kraj) {
            System.out.print("Unesite vrednost: ");
            vrednost = s.nextInt();

            suma = suma + vrednost;

            if (suma > 100) {
                suma = suma - vrednost;
                kraj = true;
            }
        }
        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma + ".");
    }
}
