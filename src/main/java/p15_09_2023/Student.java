package p15_09_2023;

public class Student extends Osoba {

    private int brIndexa;
    private double dug;

    public Student() {
    }

    public Student(String punoIme, String jmbg) {
        super(punoIme, jmbg);
    }

    public void umanjiSkolarinu (double vrednost) {
        this.dug -= vrednost;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Br indeksa: " + this.brIndexa);
        System.out.println("Dug za skolarinu: " + this.dug);
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public double getDug() {
        return dug;
    }

    public void setDug(double dug) {
        this.dug = dug;
    }
}
