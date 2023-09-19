package p19_09_2023.Zadatak2;

public abstract class Atleticar {
//Kreirati apstraktnu klasu Atleticar čiji su atributi:
//ime i prezime privatni
//i rezultat ostvaren na takmičenju koji je zasticen
//Javne metode klase su:
//apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)

    private String punoIme;
    protected double rezultat;

    public Atleticar() {
    }

    public Atleticar(String punoIme, double rezultat) {
        this.punoIme = punoIme;
        this.rezultat = rezultat;
    }

    public abstract boolean daLiJeRezultatBolji (Atleticar atleticar);

    public void print () {
        System.out.println(this.punoIme + ", " + this.rezultat);
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }
}

