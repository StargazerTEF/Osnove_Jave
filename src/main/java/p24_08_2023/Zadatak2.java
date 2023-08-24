package p24_08_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(4);
        brojevi.add(15);
        brojevi.add(26);
        brojevi.add(13);
        brojevi.add(1);

        int x = brojevi.get(3) * 10;

        brojevi.set(3, x);

        System.out.println(brojevi.get(3));

    }
}
