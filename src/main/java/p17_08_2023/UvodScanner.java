package d17_08_2023;

import java.util.Scanner;

public class UvodScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime:");
        String ime = s.next();

        System.out.println("Unesite prezime:");
        String prezime = s.next();

        System.out.println("Unesite kilazu:");
        double kg = s.nextDouble();

        System.out.println("Unesite status:");
        boolean active = s.nextBoolean();


//        System.out.println("Unesite broj a: ");
//        int a = s.nextInt();
//
//        System.out.println("Unesite broj b: ");
//        int b = s.nextInt();
//
//        int zbir = a + b;
//        int razlika = a - b;
//        int proizvod = a * b;
//        int kolicnik = a / b;
//
//        System.out.println("Zbir je: " + zbir);
//        System.out.println("Razlika je: " + razlika);
//        System.out.println("Proizvod je: " + proizvod);
//        System.out.println("Kolicnik je: " + kolicnik);



    }
}
