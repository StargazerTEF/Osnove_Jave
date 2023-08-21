package p21_08_2023;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj passworda:");
        int brojPassworda = s.nextInt();

        int poeni = 0;

        for (int i = 0; i < brojPassworda ; i++) {
            System.out.println("Unesite password:");
            String password = s.next();
            int duzinaPassworda = password.length();
            if (duzinaPassworda > 8) {
                poeni = poeni + 1;
            } else if (password.contains("@")) {
                poeni = poeni + 1;
            }   else {
                poeni = 0;
            }
            System.out.println("Password ima " + poeni + " poena.");
        }
    }
}