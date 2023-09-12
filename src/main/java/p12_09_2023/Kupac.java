package p12_09_2023;

public class Kupac {
    private String fullName;
    private ClanskaKarta clanskaKarta;

    public Kupac () {

    }
    public Kupac (String fullName) {
        this.fullName = fullName;
    }
    public void print () {
        System.out.println(this.fullName + " - " + this.clanskaKarta.getBrKartice());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }

    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }
}
