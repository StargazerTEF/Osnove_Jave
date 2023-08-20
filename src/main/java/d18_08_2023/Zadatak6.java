package d18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        /*Napisati program koji ucitava dimenziju table i stampa je na ekranu.
Primer izvrsenja:
Unesite dimenziju table: 5
 _|_|_|_|_|
 _|_|_|_|_|
 _|_|_|_|_|
 _|_|_|_|_|
 _|_|_|_|_|
*/
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dimenziju table:");
        int x = s.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                if (j == x && i != x) {
                    System.out.println("_|");
                } else {
                    System.out.print("_|");
                }
            }
        }
    }
}
