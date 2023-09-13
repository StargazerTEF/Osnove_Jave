package d12_09_2023;

public class Ugovor {
    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;

    public Ugovor (String datum, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa) {
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }
    public double procenatZarade () {
        if (kupac.isPrvaNekretnina()) {
            return 0.03;
        } else {
            return 0.02;
        }
    }
    public double zaradaAgencije () {
        return 1000 + this.cena * this.procenatZarade();
    }
    public void print () {
        System.out.print("Dana: " + this.datum + " god., sklopljen je ugovor izmedju ");
        this.prodavac.print();
        System.out.print(" i ");
        this.kupac.print();
        System.out.print(" o kupovini nekretnine koja se nalazi u ulici " + this.adresa +
                " po ceni od " + this.cena + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost " +
                "u iznosu od " + this.zaradaAgencije() + "rsd.");
    }

    public String getDatum() {
        return datum;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public int getCena() {
        return cena;
    }

    public String getAdresa() {
        return adresa;
    }
}

