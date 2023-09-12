package p12_09_2023;

public class Sastojak {
    private String name;
    private int cena;

    public Sastojak (String name, int cena) {
        this.name = name;
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
