package d12_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//U glavnoj klasi:
//kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite

        ArrayList<ZeleniKarton> zeleniKarton = new ArrayList<>();

        zeleniKarton.add(new ZeleniKarton("Aca Akic", 13289, "Osnove Jave", "Milan Jovanovic", 9));
        zeleniKarton.add(new ZeleniKarton("Aca Akic", 13289, "Osnove SQL-a", "Milan Jovanovic", 8));
        zeleniKarton.add(new ZeleniKarton("Aca Akic", 13289, "Osnove Manuelnog testiranja", "Biljana Kosic", 10));
        zeleniKarton.add(new ZeleniKarton("Aca Akic", 13289, "Java programiranje", "Milan Jovanovic", 5));
        zeleniKarton.add(new ZeleniKarton("Aca Akic", 13289, "Selenium", "Milan Jovanovic", 7));

        for (int i = 0; i < zeleniKarton.size(); i++) {
            zeleniKarton.get(i).print();
        }
        double procecnaOcena = 0;
        for (int i = 0; i < zeleniKarton.size(); i++) {
            procecnaOcena += zeleniKarton.get(i).getOcena();
        }
        System.out.println("Prosecna ocena je " + procecnaOcena / zeleniKarton.size());

        double procecnaOcenaPolozenih = 0;
        int counter = 0;
        for (int i = 0; i < zeleniKarton.size(); i++) {
            if (zeleniKarton.get(i).getOcena() > 5) {
                procecnaOcenaPolozenih += zeleniKarton.get(i).getOcena();
                counter++;
            }
        }
        System.out.println("Prosecna ocena polozenih ispita je " + procecnaOcenaPolozenih / counter);
    }
}
