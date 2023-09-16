package d14_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)

        Ispit ispit1 = new Ispit("Osnove Jave", 9, "Milan Jovanovic");
        Ispit ispit2 = new Ispit("Objektno programiranje", 8, "Milan Jovanovic");
        Ispit ispit3 = new Ispit("Selenium", 10, "Vladimir Minic");
        Ispit ispit4 = new Ispit("Manuelno testiranje", 10, "Biljana Rosic");
        Ispit ispit5 = new Ispit("Automatsko testiranje", 5, "Milan Jovanovic");
        Ispit ispit6 = new Ispit("QA testiranje", 9, "Milan Jovanovic");

        Student student1 = new Student(192, "Aki Akic", "osnovne");
        Student student2 = new Student(192, "Maja Majic", "osnovne");

        student1.dodajIspit(ispit1);
        student1.dodajIspit(ispit2);
        student1.dodajIspit(ispit3);
        student1.dodajIspit(ispit4);
        student1.dodajIspit(ispit5);
        student1.dodajIspit(ispit6);

        student1.print();

    }
}
