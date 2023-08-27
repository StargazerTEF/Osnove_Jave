package Mini_projekat;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
//**Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//
//Napišite program koji simulira prikazivanje korisnika na Slacku. Prikaz korisnika treba da se
//izvede tako da prvo budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati
//sledeće informacije:
//Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan. Informacije o
//aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno
//aktivan ili ne  (true ili false).. Naravno, korisnik i njegova aktivnost će biti upareni po
//istom indeksu. To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati
//aktivnost sa pozicije N u nizu "aktivnosti".
//
//Program će ispisivati informacije za svakog korisnika na sledeći način:
//Za aktivne korisnike:
//  | slika |o Ime Prezime
//Za neaktivne korisnike:
//  | slika |x Ime Prezime
//
//Na primer, ako je niz korisnika:              I ako su aktivnosti korisnika:
//Pera Peric                                    true
//Darko Darkovic                                false
//Marko Markovic                                true
//Stefan Stefanovic                             true
//Uros Urosevic                                 false
//Milan Milanovic                               true

//Program treba da ispiše:
//
//| slika |o Pera Peric
//| slika |o Marko Markovic
//| slika |o Stefan Stefanovic
//| slika |o Milan Milanovic
//| slika |x Darko Darkovic
//| slika |x Uros Urosevic

        ArrayList<String> users = new ArrayList<>();
        ArrayList<Boolean> activity = new ArrayList<>();

        users.add("Pera Peric");                   activity.add(true);
        users.add("Darko Darkovic");               activity.add(false);
        users.add("Marko Markovic");               activity.add(true);
        users.add("Stefan Stefanovic");            activity.add(true);
        users.add("Uros Urosevic");                activity.add(false);
        users.add("Milan Milanovic");              activity.add(true);

        String template = " | slika | ";

        for (int i = 0; i < users.size(); i++) {
            if (activity.get(i)) {
                System.out.println(template + "o " + users.get(i));
            }
        }
        for (int i = 0; i < users.size(); i++) {
            if (!activity.get(i)) {
                System.out.println(template + "x " + users.get(i));
            }
        }
    }
}
