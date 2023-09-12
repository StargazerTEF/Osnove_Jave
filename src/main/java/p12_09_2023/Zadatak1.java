package p12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Kupac kupac = new Kupac("Aca Akic");
        ClanskaKarta clanskaKarta = new ClanskaKarta(10, "9329-0239");
        Proizvod proizvod = new Proizvod("knjiga", 500);

        kupac.setClanskaKarta(clanskaKarta);
        proizvod.setKupac(kupac);

        proizvod.print();

    }
}
