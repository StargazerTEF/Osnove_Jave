package d12_09_2023;

public class FizickoLice {
    private String punoIme;
    private String licnaKarta;
    private final String jmbg;
    private boolean prvaNekretnina;

    public FizickoLice (String punoIme, String licnaKarta, String jmbg, boolean prvaNekretnina) {
        this.punoIme = punoIme;
        this.licnaKarta = licnaKarta;
        this.jmbg = jmbg;
        this.prvaNekretnina = prvaNekretnina;
    }
    public void print () {
        System.out.print(this.punoIme + ", " + this.licnaKarta);
    }
    public String getPunoIme() {
        return punoIme;
    }

    public String getLicnaKarta() {
        return licnaKarta;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isPrvaNekretnina() {
        return prvaNekretnina;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void setLicnaKarta(String licnaKarta) {
        this.licnaKarta = licnaKarta;
    }

    public void setPrvaNekretnina(boolean prvaNekretnina) {
        this.prvaNekretnina = prvaNekretnina;
    }
}
