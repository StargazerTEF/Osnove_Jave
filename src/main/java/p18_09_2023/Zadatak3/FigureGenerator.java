package p18_09_2023.Zadatak3;

import java.util.ArrayList;

public class FigureGenerator {
    public FigureGenerator() {

    }

    public Figura generisiFiguru (String tip) {
        if (tip.equals("trougao")) {
            JednakostranicniTrougao t = new JednakostranicniTrougao(5);
            return t;
        }
        else if (tip.equals("pravougaonik")) {
            Pravougaonik p = new Pravougaonik(5, 10);
            return p;
        }
        return null;
    }
    public ArrayList<JednakostranicniTrougao> generisiNizTrouglova (int n) {
        ArrayList<JednakostranicniTrougao> trouglovi = null;
        for (int i = 0; i < n; i++) {
            JednakostranicniTrougao t = new JednakostranicniTrougao(5);
            trouglovi.add(t);
        }
        return trouglovi;
    }
    public ArrayList<Pravougaonik> generisiNizPravougaonika (int n) {
        ArrayList<Pravougaonik> pravougaonici = null;
        for (int i = 0; i < n; i++) {
            Pravougaonik p = new Pravougaonik(5, 10);
            pravougaonici.add(p);
        }
        return pravougaonici;
    }
    public ArrayList<Figura> gemerisiNizFigura (int n) {
        ArrayList<Figura> figure = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            JednakostranicniTrougao t = new JednakostranicniTrougao(5);
            figure.add(t);
        }
        for (int i = 0; i < n; i++) {
            Pravougaonik p = new Pravougaonik(5, 10);
            figure.add(p);
        }
        return figure;
    }

}
