package d07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//Zadatak 1: Kreiranje klase "Student"
//Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String).
//Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima

        Student a = new Student();
        Student b = new Student();
        Student c = new Student();

        a.fullName = "Aca Akic";
        a.index = 819764312;
        a.university = "Oxford";

        b.fullName = "Ika Ikic";
        b.index = 819764313;
        b.university = "Cambridge";

        c.fullName = "Jova Jovic";
        c.index = 819764314;
        c.university = "Hull";

        System.out.println("Student: " + a.fullName + " br. indexa " + a.index + " pohadja " + a.university);
        System.out.println("Student: " + b.fullName + " br. indexa " + b.index + " pohadja " + b.university);
        System.out.println("Student: " + c.fullName + " br. indexa " + c.index + " pohadja " + c.university);
    }
}
