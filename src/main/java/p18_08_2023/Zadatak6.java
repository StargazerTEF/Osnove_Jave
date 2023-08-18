package p18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj M: ");
        int m = s.nextInt();

        System.out.println("Unesite broj N: ");
        int n = s.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print(i + ", ");
        }


    }
}
