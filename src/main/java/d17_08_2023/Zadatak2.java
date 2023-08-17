package d17_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dan: ");
        int day = s.nextInt();
        System.out.println("Unesite mesec: ");
        int month = s.nextInt();
        System.out.println("Unesite godinu: ");
        int year = s.nextInt();

        System.out.println(day + "-" + month + "-" + year);


    }
}
