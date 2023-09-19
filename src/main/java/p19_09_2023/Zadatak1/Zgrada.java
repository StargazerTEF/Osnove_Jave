package p19_09_2023.Zadatak1;

public class Zgrada extends Objekat{

//Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//broj stanova
//konstuktore, gettere i setter
//porez racuna po formuli koeficijent * povrsina * broj stanova
//prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu

    private int brStanova;

    public Zgrada() {
    }

    public Zgrada(String ulicaBroj, double povrsina, int zona, int brStanova) {
        super(ulicaBroj, povrsina, zona);
        this.brStanova = brStanova;
    }

    @Override
    public double porez() {
        return this.koeficijent() * this.povrsina * this.brStanova;
    }

    @Override
    public void print() {
        System.out.println("Ulica i broj: " + this.ulicaBroj);
        System.out.println("Povrsina objekta " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj stanova: " + this.brStanova);
        System.out.println("Porez na nekretninu: " + this.porez());
    }

    public int getBrStanova() {
        return brStanova;
    }

    public void setBrStanova(int brStanova) {
        this.brStanova = brStanova;
    }
}
