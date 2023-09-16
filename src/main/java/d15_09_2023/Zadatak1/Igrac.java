package d15_09_2023.Zadatak1;

public class Igrac extends Osoba{
    private int brojDresa;
    private String pozicija;
    private boolean daLijeKapiten;

    public Igrac() {

    }

    public Igrac(String punoIme, String jmbg, int godRodjenja, int brojDresa, String pozicija, boolean daLijeKapiten) {
        super (punoIme, jmbg, godRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.daLijeKapiten = daLijeKapiten;
    }

    @Override
    public void print () {
        super.print();
        System.out.println("nosi " + this.brojDresa + " na ledjima - igra na poziciji " + this.pozicija);
        if (this.daLijeKapiten) {
            System.out.println("Kapiten tima");
        } else {
            System.out.println("Nije kapiten tima");
        }
        System.out.println();
    }
    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isDaLijeKapiten() {
        return daLijeKapiten;
    }

    public void setDaLijeKapiten(boolean daLijeKapiten) {
        this.daLijeKapiten = daLijeKapiten;
    }
}
