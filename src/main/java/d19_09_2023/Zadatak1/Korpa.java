package d19_09_2023.Zadatak1;

import java.util.ArrayList;

public class Korpa {
//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.

    private ArrayList<Ambalaza> products;

    public Korpa() {
        this.products = new ArrayList<>();
    }

    public void addProducts (Ambalaza product) {
        this.products.add(product);
    }
    public void removeProduct (String barCode) {
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).barcode.equals(barCode)) {
                this.products.remove(i);
            }
        }
    }
    public double fullBill (SuperKartica superKartica) {
        double fullBill = 0;
        for (int i = 0; i < this.products.size(); i++) {
            fullBill += this.products.get(i).productValue();
        }
        return fullBill - superKartica.getDiscount();
    }
}
