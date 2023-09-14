package p14_09_2023;

import java.util.ArrayList;

public class Pasta {

    private ArrayList<Sastojak> sastojci;

    public Pasta() {
        this.sastojci = new ArrayList<>();
    }

    public void dodajSastojak (Sastojak newSastojak) {
        this.sastojci.add(newSastojak);
    }
    public double cenaPaste () {
        double cenaPaste = 0;
        for (int i = 0; i < this.sastojci.size(); i++) {
            cenaPaste += this.sastojci.get(i).getCena();
        }
        return cenaPaste;
    }
    public void print () {
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < this.sastojci.size(); i++) {
            this.sastojci.get(i).print();
        }
        System.out.println("Cena paste je " + cenaPaste() + "din.");
    }
    public ArrayList<Sastojak> getSastojci() {
        return sastojci;
    }
    public void obrisiSastojak (String sastojak3) {
        for (int i = 0; i < this.sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(sastojak3)) {
                this.sastojci.remove(i);
            }
        }
    }
}
