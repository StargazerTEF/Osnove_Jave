package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//  Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
//  Korisnik unosi N rekacija zatim se prikazuje evidencija:
//  Program podrzava sledece reakcije:
//  like
//  smile
//  heart
//
//  Primer izvrsenja:
//  Unesite N: 7
//  Reaguj: like
//  Reaguj: heart
//  Reaguj: smile
//  Reaguj: lol
//  Reaguj: smile
//  Reaguj: like
//  Reaguj: like
//  Summary: like 3 | smile 2 | heart 1
//
//  Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
//
//  POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva
//  promenljiva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart
//  cuva promenljiva heartCounter.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj reakcija:");
        int brojReakcija = s.nextInt();

        int likeBrojac = 0, smileBrojac = 0, heartBrojac = 0;

        for (int i = 0; i < brojReakcija; i++) {
            System.out.println("Reaguj:");
            String reakcija = s.next();
            if (reakcija.equals("like")) {
                likeBrojac = likeBrojac + 1;
            } else if (reakcija.equals("smile")) {
                smileBrojac = smileBrojac + 1;
            } else if (reakcija.equals("heart")) {
                heartBrojac = heartBrojac + 1;
            } else {
                likeBrojac = likeBrojac;
                smileBrojac = smileBrojac;
                heartBrojac = heartBrojac;
            }
        }
        System.out.println("Summary: like " + likeBrojac + " | smile " + smileBrojac + " | heart " + heartBrojac);
    }
}