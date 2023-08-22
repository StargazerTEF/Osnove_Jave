package p22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String rec = "";

        while (!rec.endsWith(".")) {
            System.out.print("Unesite rec: ");
            rec = s.next();
            System.out.println(rec);
            if (rec.equals("zajebavas") || rec.equals("mars")
                    || rec.equals("stoko") || rec.equals("svinjo")) {
                System.out.println("beep");
                {
                if (rec.endsWith(".")) {
                    System.out.println("Kraj programa!");
                }
            }
        }
            System.out.println("Kraj programa.");
    }
}
}