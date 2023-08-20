package d18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

//  Napisati program koji iscrtava iks oks tablu. Stanje na tabli se cuva u intigeru
//  koji uvek ima 9 cifara. Broj 1 u stanju je X, broj 2 je O, a 3 je prazno polje
//  Primer izvrsenja:
//  Unesite stanje table: 321311323
//  Zadatak se resava for petljom

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite stanje table (devetocifren broj koji se sastoji od cifara 1, 2 i 3): ");
        int a = s.nextInt();

        int x = 100000000;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (a / x % 10 == 1) {
                    if (j == 3) {
                        System.out.println(" X ");
                    } else {
                        System.out.print(" X |");
                    }
                } else if (a / x % 10 == 2) {
                    if (j == 3) {
                        System.out.println(" O ");
                    } else {
                        System.out.print(" O |");
                    }
                } else if (a / x % 10 == 3) {
                    if (j == 3) {
                        System.out.println("    ");
                    } else {
                        System.out.print("   |");
                    }
                }
                    x = x / 10;
            }
        }
    }
}







