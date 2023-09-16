package d15_09_2023.Zadatak2;

import d15_09_2023.Zadatak1.Osoba;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int brojDresa;
    private String pozicija;
    private boolean daLijeKapiten;
    private ArrayList<Karton> kartoni;

    public Igrac() {
        this.kartoni = new ArrayList<>();
    }

    public Igrac(String punoIme, String jmbg, int godRodjenja, int brojDresa, String pozicija, boolean daLijeKapiten) {
        super (punoIme, jmbg, godRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.daLijeKapiten = daLijeKapiten;
        this.kartoni = new ArrayList<>();
    }

    public void dodajKarton (Karton karton) {
        this.kartoni.add(karton);
    }

    public int brojZutih () {
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("zuti")) {
                counter++;
            }
        }
        return counter;
    }
    public int brojCrvenih () {
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("crveni")) {
                counter++;
            }
        }
        return counter;
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
        System.out.println("Broj zutih kartona: " + this.brojZutih());
        System.out.println("Broj crvenih kartona: " + this.brojCrvenih());
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
