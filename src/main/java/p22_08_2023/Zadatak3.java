package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean kraj = false;

        int brojac1 = 0;
        int brojac2 = 0;
        int brojac3 = 0;
        int brojac4 = 0;

        while (!kraj) {
                System.out.print("Unesite broj: ");
                int broj = s.nextInt();

                if (broj == 1) {
                    brojac1 = brojac1 + 1;
                } else if (broj == 2) {
                    brojac2 = brojac2 + 1;
                } else if (broj == 3) {
                    brojac3 = brojac3 + 1;
                } else if (broj == 4) {
                    brojac4 = brojac4 + 1;
                }
                if (brojac1 >= 1 && brojac2 >= 1 && brojac3 >= 1 && brojac4 >= 1) {
                    kraj = true;
                }
            }
                System.out.println("Kraj programa!");
        }
    }
