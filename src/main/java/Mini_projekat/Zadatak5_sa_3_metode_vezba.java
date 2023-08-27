package Mini_projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5_sa_3_metode_vezba {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu passworda: ");
        int passwordLength = s.nextInt();

        System.out.print("Da li zelite da sadrzi specijalan karakter (true or false): ");
        boolean specialChar = s.nextBoolean();

        String generatedPassword = generisiPassword(passwordLength, specialChar);

        System.out.println("Your password is: " + generatedPassword);
    }
    public static String generisiRandomKarakter() {

        ArrayList<String> randomKarakter = new ArrayList<>();

        randomKarakter.add("A"); randomKarakter.add("B"); randomKarakter.add("C");
        randomKarakter.add("D"); randomKarakter.add("E"); randomKarakter.add("F");
        randomKarakter.add("G"); randomKarakter.add("H"); randomKarakter.add("I");
        randomKarakter.add("J"); randomKarakter.add("K"); randomKarakter.add("L");
        randomKarakter.add("M"); randomKarakter.add("N"); randomKarakter.add("O");
        randomKarakter.add("P"); randomKarakter.add("Q"); randomKarakter.add("R");
        randomKarakter.add("S"); randomKarakter.add("T"); randomKarakter.add("U");
        randomKarakter.add("V"); randomKarakter.add("W"); randomKarakter.add("X");
        randomKarakter.add("Y"); randomKarakter.add("Z"); randomKarakter.add("a");
        randomKarakter.add("b"); randomKarakter.add("c"); randomKarakter.add("d");
        randomKarakter.add("e"); randomKarakter.add("f"); randomKarakter.add("g");
        randomKarakter.add("h"); randomKarakter.add("i"); randomKarakter.add("j");
        randomKarakter.add("k"); randomKarakter.add("l"); randomKarakter.add("m");
        randomKarakter.add("n"); randomKarakter.add("o"); randomKarakter.add("p");
        randomKarakter.add("q"); randomKarakter.add("r"); randomKarakter.add("s");
        randomKarakter.add("t"); randomKarakter.add("u"); randomKarakter.add("v");
        randomKarakter.add("w"); randomKarakter.add("x"); randomKarakter.add("y");
        randomKarakter.add("z"); randomKarakter.add("0"); randomKarakter.add("1");
        randomKarakter.add("2"); randomKarakter.add("3"); randomKarakter.add("4");
        randomKarakter.add("5"); randomKarakter.add("6"); randomKarakter.add("7");
        randomKarakter.add("8"); randomKarakter.add("9");

        Random gen = new Random();

        int karakter = gen.nextInt(randomKarakter.size());
        return randomKarakter.get(karakter);
    }
    public static String generisiRandomSpecijalanKarakter() {

        ArrayList<String> randomSpecKarakter = new ArrayList<>();

        randomSpecKarakter.add("@"); randomSpecKarakter.add("#"); randomSpecKarakter.add("&");
        randomSpecKarakter.add("*"); randomSpecKarakter.add("!");

        Random gen = new Random();

        int specKarakter = gen.nextInt(randomSpecKarakter.size());
        return randomSpecKarakter.get(specKarakter);
    }
    public static String generisiPassword(int passLength, boolean specChar) {
        String password = "";

        for (int i = 0; i < passLength; i++) {
            if (i == (passLength - 1) && specChar) {
                password += generisiRandomSpecijalanKarakter();
            } else {
                password += generisiRandomKarakter();
            }
        }
            return password;
    }
}




