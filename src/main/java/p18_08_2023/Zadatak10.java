package p18_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj A:");
        int a = s.nextInt();

        System.out.println("Unesite broj B:");
        int b = s.nextInt();

        for (int i = 0; i <= 10; i++) {
            if (i != a && i != b) {
                System.out.print(i + ", ");
        }


    }
}
    }