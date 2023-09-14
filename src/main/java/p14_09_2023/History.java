package p14_09_2023;

import java.util.ArrayList;

public class History {

    private ArrayList<HistoryPage> stranice;

    public History() {
        this.stranice = new ArrayList<>();
    }

    public void otvoriStranicu (HistoryPage newPage) {
        this.stranice.add(newPage);
    }

    public void obrisiPremaLinku (String link) {
        for (int i = 0; i < this.stranice.size(); i++) {
            if (this.stranice.get(i).getLink().equals(link)) {
                this.stranice.remove(i);
            }
        }
    }
    public void obrisiKolacicePremaLinku (String link) {
        for (int i = 0; i < this.stranice.size(); i++) {
            if (this.stranice.get(i).getLink().contains(link)) {
                this.stranice.get(i).obrisiKolacice();
            }
        }
    }
    public void obrisiIstoriju () {
        for (int i = 0; i < this.stranice.size(); i++) {
            this.stranice.remove(i);
        }
    }
    public void sacuvajKredencijale (String page, String username, String password) {
        for (int i = 0; i < this.stranice.size(); i++) {
            if (this.stranice.get(i).getNazivStranice().equals(page)) {
                this.stranice.get(i).sacuvajKredencijale(username, password);
            }
        }

    }
    public void pogledajIstoriju () {
        for (int i = 0; i < this.stranice.size(); i++) {
           this.stranice.get(i).print();
        }
    }
    public void obrisiSveKolacice () {
        for (int i = 0; i < this.stranice.size(); i++) {
            this.stranice.get(i).obrisiKolacice();
        }
    }
    public void obrisiSveKolaciceZaPoslSatVr (int sat, int min) {
        for (int i = 0; i < this.stranice.size(); i++) {
            if (sat * 60 + min - this.stranice.get(i).getTimeHour() * 60 + this.stranice.get(i).getTimeMin() <= 60) {
                this.stranice.get(i).obrisiKolacice();
            }
        }
    }

    public ArrayList<HistoryPage> getStranice() {
        return stranice;
    }
}
