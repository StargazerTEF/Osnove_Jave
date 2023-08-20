package v20_08_2023;

import java.util.Scanner;

public class Zadatak1_vezbanje_slack {
    public static void main(String[] args) {

//        CIA je uspela da desifruje poruke hakerske organizacije koju prati.
//        Hakerska organizacija kriptuje poruke u int tako sto svaka poruka ima 10 cifara
//        (5 karaktera). Konvencijom je ustaljeno da se slova kriptuju u dvocifrene brojeve:
//        A se kriptuje u 11
//        B se kriptuje u 12
//        …
//        Z se kriptuje u 36
//        Bilo koji drugi dvocifren broj se kriptuje u razmak.
//                Napisati program koji dekriptuje poruke hakerske organizacije.
//        Npomena: program moze da dekriptuje odjednom samo rec od 5 slova.
//                Primer izvrsenja 1:
//        Poruka: 1815222225
//        Dekriptovana poruka: HELLO
//        Poruka koja presretnuta je
//        25261528 11131920 11882015 76318830 25213198
//        Koristeci program dekriptovati presretnutu poruku

        Scanner s = new Scanner(System.in);

        int x = 1000000;

        String rec = "";

        for (int j = 0; j < 5; j++) {
            System.out.println("Upisati kriptovanu rec: ");
            int a = s.nextInt();
            for (int i = 0; i < 4; i++) {
                if (a / x % 100 == 11) {
                    rec = rec + "A";
                } else if (a / x % 100 == 12) {
                    rec = rec + "B";;
                } else if (a / x % 100 == 13) {
                    rec = rec + "C";;
                } else if (a / x % 100 == 14) {
                    rec = rec + "D";;
                } else if (a / x % 100 == 15) {
                    rec = rec + "E";;
                } else if (a / x % 100 == 16) {
                    rec = rec + "F";;
                } else if (a / x % 100 == 17) {
                    rec = rec + "G";;
                } else if (a / x % 100 == 18) {
                    rec = rec + "H";;
                } else if (a / x % 100 == 19) {
                    rec = rec + "I";;
                } else if (a / x % 100 == 20) {
                    rec = rec + "J";;
                } else if (a / x % 100 == 21) {
                    rec = rec + "K";;
                } else if (a / x % 100 == 22) {
                    rec = rec + "L";;
                } else if (a / x % 100 == 23) {
                    rec = rec + "M";;
                } else if (a / x % 100 == 24) {
                    rec = rec + "N";;
                } else if (a / x % 100 == 25) {
                    rec = rec + "O";;
                } else if (a / x % 100 == 26) {
                    rec = rec + "P";;
                } else if (a / x % 100 == 27) {
                    rec = rec + "Q";;
                } else if (a / x % 100 == 28) {
                    rec = rec + "R";;
                } else if (a / x % 100 == 29) {
                    rec = rec + "S";;
                } else if (a / x % 100 == 30) {
                    rec = rec + "T";;
                } else if (a / x % 100 == 31) {
                    rec = rec + "U";;
                } else if (a / x % 100 == 32) {
                    rec = rec + "V";;
                } else if (a / x % 100 == 33) {
                    rec = rec + "W";;
                } else if (a / x % 100 == 34) {
                    rec = rec + "X";;
                } else if (a / x % 100 == 35) {
                    rec = rec + "Y";;
                } else if (a / x % 100 == 36) {
                    rec = rec + "Z";;
                } else {
                    rec = rec + " ";
                }
                x = x / 100;
            }
                x = 1000000;
        }
        System.out.println("Kriptovana rec je:\n" + rec);
    }
}