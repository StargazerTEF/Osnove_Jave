package p19_09_2023.Zadatak1;

public abstract class Objekat {
//Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi:
//adresa (ulica i broj)
//povrsina objekta
//zona (1, 2 ili 3)
//konstuktore, gettere i settere
//metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//zona 1, koeficijent je 1.4
//zona 2, koeficijent je 1.1
//zona 3, koeficijent je 1.05
//abstraktnu metodu koja racuna i vraca porez objekta
//abstraktnu metodu stampaj

    protected String ulicaBroj;
    protected double povrsina;
    protected int zona;

    public Objekat() {
    }

    public Objekat(String ulicaBroj, double povrsina, int zona) {
        this.ulicaBroj = ulicaBroj;
        this.povrsina = povrsina;
        this.zona = zona;
    }
    public double koeficijent() {
        if (this.zona == 1) {
            return 1.4;
        } else if (this.zona == 2) {
            return 1.1;
        } else if (this.zona == 3) {
            return 1.05;
        } else {
            return 0;
        }
    }
    public abstract double porez ();

    public abstract void print ();
}
