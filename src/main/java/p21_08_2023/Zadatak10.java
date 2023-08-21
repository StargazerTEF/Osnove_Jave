package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite password:");
        String password = s.next();

        String skriveniPassword = "";

        int duzinaPassworda = password.length();

        for (int i = 0; i < duzinaPassworda; i++) {
            skriveniPassword = skriveniPassword + "*";
        }
        System.out.println(skriveniPassword);
    }
}
