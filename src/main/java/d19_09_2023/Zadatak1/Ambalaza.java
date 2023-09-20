package d19_09_2023.Zadatak1;

public abstract class Ambalaza {
//Kreirati abstraktnu klasu Ambalaza koja ima:
//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//abstraktnu metodu koja vraca cenu artikla
//abstraktnu metodu stampaj

    protected String barcode;
    protected String name;
    protected double netWeight;
    protected double totalWeight;

    public Ambalaza() {
    }

    public Ambalaza(String barcode, String name, double netWeight, double totalWeight) {
        this.barcode = barcode;
        this.name = name;
        this.netWeight = netWeight;
        this.totalWeight = totalWeight;
    }

    public double packadgeWeight () {
        return this.totalWeight - this.netWeight;
    }

    public abstract double productValue ();

    public abstract void print ();

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }
}
