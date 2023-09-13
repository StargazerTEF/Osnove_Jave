package d12_09_2023;

public class Racun {
    private String brRacuna;
    private String punoIme;
    private double stanje;

    public Racun () {

    }
    public void uplatiNaRacun (double vrednost) {
        this.stanje += vrednost;
    }
    public void skiniSaRacuna (double vrednost) {
        this.stanje -= vrednost;
    }
    public void print () {
        System.out.println(this.punoIme + " - " + this.brRacuna);
        System.out.println("Stanje na racunu je " + this.stanje + " rsd.");
        System.out.println();
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public double getStanje() {
        return stanje;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
}
