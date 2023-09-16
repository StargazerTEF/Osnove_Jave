package d14_09_2023.Zadatak2;

import java.util.ArrayList;

public class Kombinacija {
        private String id;
        private ArrayList<Integer> brojevi;

    public Kombinacija(String id, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
        this.id = id;
        this.brojevi = new ArrayList<>();
        this.brojevi.add(jedan);
        this.brojevi.add(dva);
        this.brojevi.add(tri);
        this.brojevi.add(cetiri);
        this.brojevi.add(pet);
        this.brojevi.add(sest);
        this.brojevi.add(sedam);

    }

    public boolean daLIJeKombinacijaIsta (Kombinacija k) {
        for (int i = 0; i < this.brojevi.size(); i++) {
            if (this.brojevi.get(i) != k.brojevi.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void print () {
        System.out.println("ID: " + this.id);
        System.out.print("brojevi: ");
        for (int i = 0; i < this.brojevi.size(); i++) {
            System.out.print(this.brojevi.get(i) + ", ");
        }
        System.out.println();
    }
    public String getId() {
        return id;
    }

    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }
}
