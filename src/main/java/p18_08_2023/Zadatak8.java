package p18_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite jacinu zvuka: ");
        int zvuk = s.nextInt();

        if (zvuk == 0) {
            System.out.println("</");
        } else {
            System.out.print("<");
            for (int i = 1; i <= zvuk; i++) {
                System.out.print("|");
                }
            }
        }
    }