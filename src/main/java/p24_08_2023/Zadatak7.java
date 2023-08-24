package p24_08_2023;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {

        ArrayList<String> pasta = new ArrayList<>();
        ArrayList<Integer> cena = new ArrayList<>();

        pasta.add("AGLIO E OLIO");      cena.add(500);
        pasta.add("PRIMAVERA");         cena.add(340);
        pasta.add("ARRABBIATA");        cena.add(420);
        pasta.add("NAPOLITANA");        cena.add(440);
        pasta.add("POLLO E SPINACI");   cena.add(550);

        String cenovnik = "";

        for (int i = 0; i < pasta.size(); i++) {
            System.out.println(pasta.get(i) + ".............." + cena.get(i) + "rsd");
        }



    }
}
