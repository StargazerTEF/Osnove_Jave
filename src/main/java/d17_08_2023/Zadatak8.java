package d17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Upisati stranicu a: ");
        int a = s.nextInt();

        System.out.println("Upisati stranicu b: ");
        int b = s.nextInt();

        System.out.println("Upisati stranicu c: ");
        int c = s.nextInt();

        if (a * a + b * b == c * c) {
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }

    }
}
