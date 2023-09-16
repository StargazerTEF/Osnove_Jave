package d14_09_2023.Zadatak2;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> kombinacija;

    public Listic() {
        this.kombinacija = new ArrayList<>();
    }

    public void dodajKombinaciju (Kombinacija kombinacija) {
        this.kombinacija.add(kombinacija);
    }
    public boolean daLiJeKombinacijaDobitna (Kombinacija dobitnaKombinacija) {
        for (int i = 0; i < this.kombinacija.size(); i++) {
            if (this.kombinacija.get(i).daLIJeKombinacijaIsta(dobitnaKombinacija)) {
                return true;
            }
        }
        return false;
    }

    public String kojaJeKombinacijaDobitna (Kombinacija dobitnaKombinacija) {
        for (int i = 0; i < this.kombinacija.size(); i++) {
            if (this.kombinacija.get(i).daLIJeKombinacijaIsta(dobitnaKombinacija)) {
                return this.kombinacija.get(i).getId();
            }
        }
        return "uplacena u Novom Sadu";
    }

    public void print () {
        for (int i = 0; i < this.kombinacija.size(); i++) {
            this.kombinacija.get(i).print();
        }
        System.out.println();
    }
}
