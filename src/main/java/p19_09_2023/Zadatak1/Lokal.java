package p19_09_2023.Zadatak1;

public class Lokal extends Objekat{
//Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//konstuktore
//porez racuna po formuli koeficijent * povrsina * 1.3
//prepisati metodu stampaj tako da stampa sve podatke vezane za lokal


    public Lokal() {
    }

    public Lokal(String ulicaBroj, double povrsina, int zona) {
        super(ulicaBroj, povrsina, zona);
    }

    @Override
    public double porez() {
        return this.koeficijent() * this.povrsina * 1.3;
    }

    @Override
    public void print() {
        System.out.println("Ulica i broj: " + this.ulicaBroj);
        System.out.println("Povrsina objekta " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Porez na nekretninu: " + this.porez());
    }
}
