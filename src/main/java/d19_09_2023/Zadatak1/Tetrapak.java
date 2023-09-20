package d19_09_2023.Zadatak1;

public class Tetrapak extends Ambalaza {
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslove:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.

    private boolean isRecyclable;
    private double baseValue;

    public Tetrapak() {
    }

    public Tetrapak(String barcode, String name, double netWeight, double totalWeight, boolean isRecyclable, double baseValue) {
        super(barcode, name, netWeight, totalWeight);
        this.isRecyclable = isRecyclable;
        this.baseValue = baseValue;
    }

    @Override
    public double productValue() {
        if (this.isRecyclable) {
        return this.baseValue + 1.5 * this.packadgeWeight();
        } else {
            return this.baseValue;
        }
    }

    @Override
    public void print() {
        System.out.println("Barkod: " + this.barcode);
        System.out.println("Naziv artikla: " + this.name);
        System.out.println("Cena artikla: " + this.productValue());
        if (this.isRecyclable) {
            System.out.println("Ambalaza je reciklazna");
        } else {
            System.out.println("Ambalaza nije reciklazna");
        }
        System.out.println();
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public void setRecyclable(boolean recyclable) {
        isRecyclable = recyclable;
    }

    public double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }
}
