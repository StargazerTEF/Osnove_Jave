package d19_09_2023.Zadatak1;

public class StaklenaAmbalaza extends Ambalaza {
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.

    private double rent;
    private boolean isRentPayable;
    private double baseValue;

    public StaklenaAmbalaza() {
    }

    public StaklenaAmbalaza(String barcode, String name, double netWeight, double totalWeight, double rent, boolean isRentPayable, double baseValue) {
        super(barcode, name, netWeight, totalWeight);
        this.rent = rent;
        this.isRentPayable = isRentPayable;
        this.baseValue = baseValue;
    }

    @Override
    public double productValue() {
        if (this.isRentPayable) {
            return this.baseValue * 1.2 + this.rent;
        } else {
            return this.baseValue * 1.2;
        }
    }

    @Override
    public void print() {
        System.out.println("Barkod: " + this.barcode);
        System.out.println("Naziv artikla: " + this.name);
        System.out.println("Cena artikla: " + this.productValue());
        if (isRentPayable) {
            System.out.println("Kaucija se placa i uracunata je u cenu.");
        } else {
            System.out.println("Kaucija se ne placa.");
        }
        System.out.println();
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public boolean isRentPayable() {
        return isRentPayable;
    }

    public void setRentPayable(boolean rentPayable) {
        isRentPayable = rentPayable;
    }

    public double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }
}
