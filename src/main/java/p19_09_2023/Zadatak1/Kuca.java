package p19_09_2023.Zadatak1;

public class Kuca extends Objekat {
//Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//konstuktore, gettere i setter
//porez racuna po formuli: koeficijent * povrsina.
//prepisati metodu stampaj tako da stampa sve podatke vezane za kucu

    private int brUkucana;

    public Kuca() {
    }

    public Kuca(String ulicaBroj, double povrsina, int zona, int brUkucana) {
        super(ulicaBroj, povrsina, zona);
        this.brUkucana = brUkucana;
    }

    @Override
    public double porez() {
        return this.povrsina * this.koeficijent();
    }

    @Override
    public void print() {
        System.out.println("Ulica i broj: " + this.ulicaBroj);
        System.out.println("Povrsina objekta " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj clanova domacinstva: " + this.brUkucana);
        System.out.println("Porez na nekretninu: " + this.porez());
    }

    public int getBrUkucana() {
        return brUkucana;
    }

    public void setBrUkucana(int brUkucana) {
        this.brUkucana = brUkucana;
    }
}
