package p12_09_2023;

public class Proizvod {
    private String ime;
    private Kupac kupac;
    private int cenaIzrade;

    public Proizvod () {

    }
    public Proizvod (String ime, int cenaIzrade) {
        this.ime = ime;
        this.cenaIzrade = cenaIzrade;
    }
    public double cenaProizvoda () {
        return this.cenaIzrade * 1.9 * ((double) (100 - this.kupac.getClanskaKarta().getPopust()) / 100);
    }
    public void print () {
        System.out.println(this.ime + " - " + this.cenaProizvoda());
        this.kupac.print();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }
}
