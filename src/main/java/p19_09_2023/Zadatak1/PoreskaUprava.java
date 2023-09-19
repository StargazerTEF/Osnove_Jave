package p19_09_2023.Zadatak1;

import java.util.ArrayList;

public class PoreskaUprava {
//Kreirati klasu PoreskaUprava koja za atribute ima:
//ime grada u kom se nalazi
//niz objekata
//metodu dodaj objekat
//metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//metodu koja vraca objekat sa najmanjim porezom
//metodu koja racuna ukupan porez za ceo grad
//metodu koja stampa sve objekte

    private String imeGrada;
    private ArrayList<Objekat> objekti;

    public PoreskaUprava() {
        this.objekti = new ArrayList<>();
    }

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        this.objekti = new ArrayList<>();
    }

    public void dodajObjekat (Objekat objekat) {
        this.objekti.add(objekat);
    }

    public Objekat najveciPorez () {
        Objekat najveci = this.objekti.get(0);
        for (Objekat objekat : objekti) {
            if (objekat.porez() > najveci.porez()) {
                najveci = objekat;
            }
        }
        return najveci;
    }
    public Objekat najmanjiPorez () {
        Objekat najmanji = this.objekti.get(0);
        for (Objekat objekat : objekti) {
            if (objekat.porez() < najmanji.porez()) {
                najmanji = objekat;
            }
        }
        return najmanji;
    }
    public double ukupanPorez () {
        double ukupanPorez = 0;
        for (Objekat objekat : objekti) {
            ukupanPorez += objekat.porez();
        }
        return ukupanPorez;
    }
    public void print () {
        for (Objekat objekat : objekti) {
            objekat.print();
        }
    }
}
