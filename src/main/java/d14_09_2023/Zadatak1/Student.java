package d14_09_2023.Zadatak1;

import java.util.ArrayList;

public class Student {
    private int brIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student() {
        this.ispiti = new ArrayList<Ispit>();
    }

    public Student(int brIndeksa, String punoIme, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<Ispit>();
    }
    public void dodajIspit (Ispit ispit) {
        this.ispiti.add(ispit);
    }
    public double prosekStudija () {
        int counter = 0;
        double prosek = 0;
        for (Ispit ispit : ispiti) {
            if (ispit.daLiJeIspitPolozen()) {
                prosek += ispit.getOcena();
                counter++;
            }
        }
        return prosek / counter;
    }

    public void print () {
        System.out.println("Student: ");
        System.out.println(this.brIndeksa + " - " + this.punoIme + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).print();
        }
        System.out.println("Prosek: " + this.prosekStudija());
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
}
