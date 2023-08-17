package d17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a: ");
        int a = s.nextInt();

        System.out.println("Unesite broj b: ");
        int b = s.nextInt();

        if (b < a) {
            System.out.println("b je manje.");
        }



    }
}
