package d14_09_2023.Zadatak1;

public class Ispit {
    private String predmet;
    private int ocena;
    private String punoImeProfesora;

    public Ispit() {

    }

    public Ispit(String predmet, int ocena, String punoImeProfesora) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.punoImeProfesora = punoImeProfesora;
    }

    public boolean daLiJeIspitPolozen () {
        return this.ocena > 5 && this.ocena <= 10;
    }
    public void print () {
        System.out.println(this.predmet + " - " + this.ocena + " - " + this.punoImeProfesora);
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }
}
