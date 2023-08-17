package d17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email i jmbg
//        korisnika u formatu:
//        [Ime] [Prezime] - [JMBG]
//        Broj tel: [Broj telefona],
//        Email: [Email]

//        Unesite ime: Milan
//        Unesite prezime: Jovanovic
//        Unesite broj: +209329832
//        Unesite email: milan@gmail.com
//        Unesite jmbg: 329032938923

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite JMBG: ");
        String JMBG = s.next();

        System.out.println("Unesite broj telefona: ");
        String brTel = s.next();

        System.out.println("Unesite email: ");
        String email = s.next();

        System.out.println(ime + " " + prezime + " - " + JMBG);
        System.out.println("Broj Tel: " + brTel);
        System.out.println("Email: " + email);




    }
}
