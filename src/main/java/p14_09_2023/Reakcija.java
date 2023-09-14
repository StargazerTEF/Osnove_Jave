package p14_09_2023;

public class Reakcija {
    private String tip;
    private String punoIme;

    public Reakcija() {
    }

    public Reakcija(String tip, String punoIme) {
        this.tip = tip;
        this.punoIme = punoIme;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
}
