package d17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Upisati broj a: ");
        double a = s.nextDouble();

        System.out.println("Upisati broj b: ");
        double b = s.nextDouble();

        System.out.println("Upisati broj c: ");
        double c = s.nextDouble();

        double avg = (a + b + c) / 3;

        System.out.println(avg);


    }
}
