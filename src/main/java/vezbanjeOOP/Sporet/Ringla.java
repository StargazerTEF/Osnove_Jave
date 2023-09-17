package vezbanjeOOP.Sporet;

public class Ringla {

    private String tip;
    private int jacina;
    private double jacinaGrejaca;

    public Ringla (String tip, double jacinaGrejaca) {
        this.tip = tip;
        this.jacinaGrejaca = jacinaGrejaca;
    }

    public int getJacina() {
        return jacina;
    }

    private int maxBrPojacavanja () {
        if (this.tip.equals("obicna")) {
            return 3;
        } else if (this.tip.equals("ekspres")) {
            return 12;
        } else {
            return 0;
        }
    }
    public void pojacajRinglu () {
        this.jacina++;
        if (this. jacina > this.maxBrPojacavanja()) {
            this.jacina = this.maxBrPojacavanja();
        }
    }
    public void iskljuciRinglu () {
        this.jacina = 0;
    }
    public boolean daLiJeRinglaUkljucena () {
        return this.jacina > 0;
    }
    public double potrosnjaElEnergije (double brSati) {
        return (double) 100 / this.maxBrPojacavanja() * this.jacina * this.jacinaGrejaca * brSati;
    }
    public void print () {
        if (this.daLiJeRinglaUkljucena()) {
            System.out.println("Ringla je ukljucena.");
        } else {
            System.out.println("Ringla je iskljucena.");
        }
        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejaca + "kW");
    }
}
