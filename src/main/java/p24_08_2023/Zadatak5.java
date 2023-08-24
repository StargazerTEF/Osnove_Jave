package p24_08_2023;

import java.util.ArrayList;

public class Zadatak5 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(4);
        brojevi.add(15);
        brojevi.add(27);
        brojevi.add(172);
        brojevi.add(88);
        int suma = 0;

        for (int i = 0; i < brojevi.size(); i++) {
            suma = suma + brojevi.get(i);
        }
        System.out.println(suma);

    }
}
