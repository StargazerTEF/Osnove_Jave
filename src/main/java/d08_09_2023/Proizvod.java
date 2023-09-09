package d08_09_2023;

public class Proizvod {

    String naziv;
    double cena;
    double tezina;

    public void stampaj (){
        System.out.println("{{" + this.naziv + "}}" + ", " + "{{" + this.cena + "}}" + ", " + "{{" + this.tezina + "}}");
    }

    public void povecajCenu (double povecanje) {
        this.cena += povecanje;
    }

    public double vratiCenuSaPopustom (double popust) {
        return this.cena - this.cena * popust/100;
    }

    public int racunajPostarinu () {
        int postarina = 0;
        if (this.tezina < 100) {
           postarina = 200;
        } else if (this.tezina < 500) {
            postarina = 400;
        } else {
            postarina = 1000;
        }
        return postarina;
    }
}
