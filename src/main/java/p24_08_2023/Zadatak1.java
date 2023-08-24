package p24_08_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

        int suma = brojevi.get(0) + brojevi.get(brojevi.size() - 1);

        System.out.println("Suma je: "  + suma);
    }
}
