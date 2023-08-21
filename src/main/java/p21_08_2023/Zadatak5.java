package p21_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int suma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Unesite broj N: ");
            int brojN = s.nextInt();
            suma = suma + brojN;
        }
        System.out.println("Suma je " + suma + ".");
    }
}
