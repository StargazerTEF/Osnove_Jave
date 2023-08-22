package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int brojacNula = 0;

        while (brojacNula < 2) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if (broj == 0) {
                brojacNula = brojacNula + 1;
            }
        }
            System.out.println("KRAJ!");
    }
}
