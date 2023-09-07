package p7_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Racun a = new Racun();
        Racun b = new Racun();

        a.brRacuna = "840-23932-323";
        a.fullName = "Ivan Ivanovic";
        a.stanjeRacuna = 1000;

        b.brRacuna = "830-24931-313";
        b.fullName = "Mika Mikic";
        b.stanjeRacuna = 200;

        System.out.println("Posiljalac: " + a.fullName + ", " + a.brRacuna + ", stanje: " + a.stanjeRacuna);
        System.out.println("Posiljalac: " + b.fullName + ", " + b.brRacuna + ", stanje: " + b.stanjeRacuna);

        System.out.print("Unesite sumu za transakciju: ");
        int suma = s.nextInt();

        a.stanjeRacuna -= suma;
        b.stanjeRacuna += suma;

        System.out.println("Stanje nakon transakcije: ");
        System.out.println("Posiljalac: " + a.fullName + ", " + a.brRacuna + ", stanje: " + a.stanjeRacuna);
        System.out.println("Posiljalac: " + b.fullName + ", " + b.brRacuna + ", stanje: " + b.stanjeRacuna);

    }
}
