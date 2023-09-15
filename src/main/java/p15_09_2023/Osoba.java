package p15_09_2023;

public class Osoba {
    protected String punoIme;
    protected String jmbg;

    public Osoba() {
    }

    public Osoba(String punoIme, String jmbg) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
    }

    public void print () {
        System.out.println(this.punoIme + ", " + this.jmbg);
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
}
