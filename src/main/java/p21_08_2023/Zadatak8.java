package p21_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite petocifren broj:");
        int broj = s.nextInt();

        int x = 1;

        int y = 0;

        for (int i = 0; i < 5; i++) {
            y = broj / x % 10;
            x = x * 10;

            if (i == 4){
                System.out.print(y);
            } else {
                System.out.print(y + ", ");
            }
        }
    }
}