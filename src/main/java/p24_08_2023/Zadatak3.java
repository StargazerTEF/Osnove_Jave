package p24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(4);
        brojevi.add(212);
        brojevi.add(34);
        brojevi.add(65);
        brojevi.add(123);

        int x = brojevi.get(0);

        int y = brojevi.get(4);

        int z = x;
        x = y;

        brojevi.set(0, x);
        brojevi.set(4, z);

        System.out.println(brojevi);




    }
}
