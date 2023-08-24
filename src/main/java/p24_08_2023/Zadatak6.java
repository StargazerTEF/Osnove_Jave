package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();
        Random gen = new Random();

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(10);
        brojevi.add(12);
        brojevi.add(14);
        brojevi.add(16);
        brojevi.add(18);
        brojevi.add(20);

        for (int i = 0; i < 8 ; i++) {
            int x = gen.nextInt(10);
            int y = gen.nextInt(10);

            int prviBroj = brojevi.get(x);
            int drugiBroj = brojevi.get(y);

            int zamena = prviBroj;
            prviBroj = drugiBroj;

            brojevi.set(x, prviBroj);
            brojevi.set(y, zamena);
        }
        for (int i = 0; i < brojevi.size() ; i++) {
            System.out.print(brojevi.get(i) + ", ");
        }
    }
}
