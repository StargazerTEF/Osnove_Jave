package p15_09_2023;

public class Profesor extends Osoba{

    private String predmet;
    private double plata;

    public Profesor() {

    }

    public Profesor(String punoIme, String jmbg, String predmet, double plata) {
        super(punoIme, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }

    public void povecajPLatu (double procenatPovecanja) {
        this.plata += this.plata * procenatPovecanja / 100;
    }

    @Override
    public void print () {
        super.print();
        System.out.println("Predmet: " + this.predmet);
        System.out.println("Plata: " + this.plata);
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }
}
