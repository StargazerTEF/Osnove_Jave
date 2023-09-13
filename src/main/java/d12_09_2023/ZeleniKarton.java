package d12_09_2023;

public class ZeleniKarton {
    private String punoImeStudenta;
    private int brIndeksa;
    private String nazivPredmeta;
    private String punoImeProfesora;
    private int ocena;

    public ZeleniKarton(String punoImeStudenta, int brIndeksa, String nazivPredmeta, String punoImeProfesora, int ocena) {
        this.punoImeStudenta = punoImeStudenta;
        this.brIndeksa = brIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.punoImeProfesora = punoImeProfesora;
        this.ocena = ocena;
    }
    public boolean isIspitPolozen () {
        if (this.ocena > 5) {
            return true;
        }
        return false;
    }
    public void print () {
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.punoImeStudenta + ", " + this.brIndeksa);
        System.out.println("Profesor: " + this.punoImeProfesora);
    }
    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }
}
