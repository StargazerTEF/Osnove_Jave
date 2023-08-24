package p24_08_2023;

import java.util.ArrayList;

public class Zadatak8 {
    public static void main(String[] args) {

        ArrayList<String> registracionaPolja = new ArrayList<>();
        ArrayList<Boolean> obaveznaPolja = new ArrayList<>();

        registracionaPolja.add("First name: ");         obaveznaPolja.add(true);
        registracionaPolja.add("Last name: ");          obaveznaPolja.add(true);
        registracionaPolja.add("Email: ");              obaveznaPolja.add(true);
        registracionaPolja.add("Password: ");           obaveznaPolja.add(true);
        registracionaPolja.add("Phone: ");              obaveznaPolja.add(false);
        registracionaPolja.add("Address: ");            obaveznaPolja.add(false);


        for (int i = 0; i < registracionaPolja.size(); i++) {
            if (obaveznaPolja.get(i))  {
                System.out.println(registracionaPolja.get(i) + "*_____________________");
            } else {
                System.out.println(registracionaPolja.get(i) + "______________________");
            }
        }




    }
}
