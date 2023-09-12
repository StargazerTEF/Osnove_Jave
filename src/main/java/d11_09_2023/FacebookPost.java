package d11_09_2023;

public class FacebookPost {

    private String description;
    private Korisnik korisnik;

    public FacebookPost () {

    }
    public FacebookPost (String description) {
        this.description = description;
    }
    public void print () {
        if (this.korisnik != null) {
        this.korisnik.print();
        }
        System.out.println(this.description);
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
