package p18_09_2023.Zadatak3;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak3 {
    public static void main(String[] args) {

        Figura f;

        JednakostranicniTrougao t1 = new JednakostranicniTrougao(5);
        JednakostranicniTrougao t2 = new JednakostranicniTrougao(7);

        Pravougaonik p1 = new Pravougaonik(3, 4);
        Pravougaonik p2 = new Pravougaonik(2, 5);
        Pravougaonik p3 = new Pravougaonik(4, 8);

        ArrayList<Figura> figure = new ArrayList<>(Arrays.asList(t1, t2, p1, p2, p3));

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).print();
        }
        double obimi = 0;
        double povrsine = 0;

        for (int i = 0; i < figure.size(); i++) {
            obimi += figure.get(i).obim();
            povrsine += figure.get(i).povrsina();
        }
        System.out.println("Ukupan obim je " + obimi);
        System.out.println("Ukupna povrsina je " + povrsine);

        FigureGenerator fg1 = new FigureGenerator();
        FigureGenerator fg2 = new FigureGenerator();

        Figura tr1 = fg1.generisiFiguru("trougao");
        tr1.print();

        ArrayList<Figura> figura = fg2.gemerisiNizFigura(5);
        for (int i = 0; i < figura.size() ; i++) {
            figura.get(i).print();
        }

    }
}
