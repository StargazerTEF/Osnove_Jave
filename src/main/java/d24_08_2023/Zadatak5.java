package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati
//indekse onih clanova niza koji su jednaki broju X.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 7
//Unesite broj: 3
//Unesite broj: 9
//Unesite X: 3
//
//Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

        ArrayList<Integer> A = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite " + (i + 1) + ". broj: ");
            int number = s.nextInt();
            A.add(number);
        }
        System.out.print("Unesite X: ");
        int x = s.nextInt();

        System.out.println();
        System.out.print("Elementi niza A koji su jednaki broju " + x + " imaju indekse: ");

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                System.out.print(i + ", ");
            }
        }
    }
}
