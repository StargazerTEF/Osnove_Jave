package d12_09_2023;

public class Transakcija {
    private int id;
    private Racun prebacivanjeSa;
    private Racun prebacivanjeNa;

    public Transakcija (int id, Racun prebacivanjeSa, Racun prebacivanjeNa) {
        this.id = id;
        this.prebacivanjeSa = prebacivanjeSa;
        this.prebacivanjeNa = prebacivanjeNa;
    }
    public double provizija (double iznos) {
        if (iznos < 4500) {
            return 45;
        } else {
            return 0.01 * iznos;
        }
    }
    public void izvrsiTransakciju (double iznos) {
        if (this.prebacivanjeSa.getStanje() - iznos - this.provizija(iznos) >= 0) {
            this.prebacivanjeSa.skiniSaRacuna(iznos + this.provizija(iznos));
            this.prebacivanjeNa.uplatiNaRacun(iznos);
            System.out.println("Transakcija je realizovana.");
        } else {
            System.out.println("Transakcija nije realizovana. Nemate dovoljno sredstava na racunu.");
        }
    }
    public void print () {
        System.out.println(this.id);
        System.out.println("Racun sa: " + this.prebacivanjeSa.getPunoIme() + " - " + this.prebacivanjeSa.getBrRacuna());
        System.out.println("Racun na: " + this.prebacivanjeNa.getPunoIme() +  " - " + this.prebacivanjeNa.getBrRacuna());
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public Racun getPrebacivanjeSa() {
        return prebacivanjeSa;
    }

    public Racun getPrebacivanjeNa() {
        return prebacivanjeNa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrebacivanjeNa(Racun prebacivanjeNa) {
        this.prebacivanjeNa = prebacivanjeNa;
    }

    public void setPrebacivanjeSa(Racun prebacivanjeSa) {
        this.prebacivanjeSa = prebacivanjeSa;
    }
}
