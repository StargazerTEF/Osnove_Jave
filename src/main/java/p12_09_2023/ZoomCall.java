package p12_09_2023;

public class ZoomCall {
    private String link;
    private String password;
    private Korisnik korisnikHost;
    private Korisnik korisnikGuest;

    public ZoomCall (String link, String password, Korisnik korisnikHost) {
        this.link = link;
        this.password = password;
        this.korisnikHost = korisnikHost;
    }

    public void print () {
        System.out.println("Zoom Call: " + this.link);
        System.out.println("Password: " + password);
        System.out.println("Host: " + this.korisnikHost.getFullName());
        if (this.korisnikGuest != null) {
            System.out.println("Guest: " + this.korisnikGuest.getFullName());
            System.out.println("Maksimalno trajanje poiva je " + this.korisnikHost.maxCallLength() + " min");
        }
    }
    public String getLink() {
        return link;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getKorisnik() {
        return korisnikHost;
    }

    public Korisnik getKorisnikGuest() {
        return korisnikGuest;
    }

    public void setKorisnikGuest(Korisnik korisnikGuest) {
        this.korisnikGuest = korisnikGuest;
    }

}
