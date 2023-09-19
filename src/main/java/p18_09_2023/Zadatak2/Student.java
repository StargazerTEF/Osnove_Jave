package p18_09_2023.Zadatak2;

public abstract class Student {

    protected String punoIme;
    protected int brIndeksa;
    protected int godStudija;

    public Student() {

    }

    public Student(String punoIme, int brIndeksa, int godStudija) {
        this.punoIme = punoIme;
        this.brIndeksa = brIndeksa;
        this.godStudija = godStudija;
    }

    public abstract double cenaSkolarine ();
    public abstract boolean daLiJeNaBudzetu ();

    public void print () {
        System.out.println("Student: " + this.punoIme + ", br indeksa: " + this.brIndeksa + ", trenutno je na " + this.godStudija + ". godini studija");
        System.out.print("Finansiranje: ");
        if (daLiJeNaBudzetu()) {
            System.out.println("budzet");
        } else {
            System.out.println("samofinansirajuci");
            System.out.println("Cena skolarine " + this.cenaSkolarine());
        }
    }
    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public int getGodStudija() {
        return godStudija;
    }

    public void setGodStudija(int godStudija) {
        this.godStudija = godStudija;
    }
}
