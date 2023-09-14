package p14_09_2023;


public class Zadatak1 {
    public static void main(String[] args) {

        Sastojak sastojak1 = new Sastojak("kecap", 78.99);
        Sastojak sastojak2 = new Sastojak("pelat", 49.99);
        Sastojak sastojak3 = new Sastojak("parizer", 65.99);
        Sastojak sastojak4 = new Sastojak("sir", 88.99);

        Pasta pasta = new Pasta();
        pasta.dodajSastojak(sastojak1);
        pasta.dodajSastojak(sastojak2);
        pasta.dodajSastojak(sastojak3);
        pasta.dodajSastojak(sastojak4);

        pasta.print();
        pasta.obrisiSastojak("parizer");
        pasta.print();


    }
}
