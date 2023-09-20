package d19_09_2023.Zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
//Kreirati klasu PlaninarskiDom koja ima privatne atribute:
//naziv doma
//godinu kada je osnovan.
//članove doma koji su planinari (klasa vodi računa o nizu)
//Dok od javnih:
//default-ni konstuktor i konstuktor koji postavlja sve parametre
//gettere i settere koji su potrebni
//metodu učlani planinara, koja dodaje planinara u niz
//metodu koja vraća broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija)
//metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//metodu koja štampa podatke o domu i o svim članovima doma
//metodu koja racuna i vraca mesecni prihod od clanarina svih planinara

    private String name;
    private int yearFounded;
    private ArrayList<Planinar> planinari;

    public PlaninarskiDom() {
        this.planinari = new ArrayList<>();
    }

    public PlaninarskiDom(String name, int yearFounded) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.planinari = new ArrayList<>();
    }

    public void addMountaineer (Planinar planinar) {
        this.planinari.add(planinar);
    }

    public int numberOfSuccessfulClimbs (Planina planina) {
        int counter = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).successfulClimb(planina)) {
                counter++;
            }
        }
        return counter;
    }

    public void removeMountaineer (int id) {
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).id == id) {
                this.planinari.remove(i);
            }
        }
    }

    public void print () {
        System.out.println("Planinarski dom: " + this.name + ", osnovan " + this.yearFounded + ". godine");
        System.out.println("Clanovi planinarskog doma: ");
        for (int i = 0; i < this.planinari.size(); i++) {
            this.planinari.get(i).print();
        }
    }

    public double fullMountaineersFee () {
        double sum = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            sum += this.planinari.get(i).mountaineerFee();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setPlaninari(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }
}
