package Mini_projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        **Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da
//istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije
//razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim
//situacijama.
//Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti
//željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te
//parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera
//i passworda.
//generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz
//stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa
//fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povratnu vrednost
//(string). Ova metoda nema ulazne parametre.
//generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter.
//Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim
//vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema
//ulazne parametre.
//
//Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//Glavni program:
//   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//Primer izvršenja 1:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: true
//Generisan password: eD9Kx0e@
//
//Primer izvršenja 2:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: false
//Generisan password: eCxdwEeFEx

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu passworda: ");
        int passwordLength = s.nextInt();

        System.out.print("Da li zelite da sadrzi specijalan karakter (true or false): ");
        boolean specialChar = s.nextBoolean();

        String password = "";

        for (int i = 0; i < passwordLength; i++) {
            if (i == (passwordLength - 1) && specialChar) {
                password += generisiRandomSpecijalanKarakter();
            } else {
                password += generisiRandomKarakter();
            }
        }
            System.out.println("Your password is: " + password);
    }
    public static String generisiRandomKarakter() {

        ArrayList<String> randomKarakter = new ArrayList<>();

        randomKarakter.add("A"); randomKarakter.add("B"); randomKarakter.add("C");
        randomKarakter.add("D"); randomKarakter.add("E"); randomKarakter.add("F");
        randomKarakter.add("G"); randomKarakter.add("H"); randomKarakter.add("I");
        randomKarakter.add("J"); randomKarakter.add("K"); randomKarakter.add("L");
        randomKarakter.add("M"); randomKarakter.add("N"); randomKarakter.add("O");
        randomKarakter.add("P"); randomKarakter.add("Q"); randomKarakter.add("R");
        randomKarakter.add("S"); randomKarakter.add("T"); randomKarakter.add("U");
        randomKarakter.add("V"); randomKarakter.add("W"); randomKarakter.add("X");
        randomKarakter.add("Y"); randomKarakter.add("Z"); randomKarakter.add("a");
        randomKarakter.add("b"); randomKarakter.add("c"); randomKarakter.add("d");
        randomKarakter.add("e"); randomKarakter.add("f"); randomKarakter.add("g");
        randomKarakter.add("h"); randomKarakter.add("i"); randomKarakter.add("j");
        randomKarakter.add("k"); randomKarakter.add("l"); randomKarakter.add("m");
        randomKarakter.add("n"); randomKarakter.add("o"); randomKarakter.add("p");
        randomKarakter.add("q"); randomKarakter.add("r"); randomKarakter.add("s");
        randomKarakter.add("t"); randomKarakter.add("u"); randomKarakter.add("v");
        randomKarakter.add("w"); randomKarakter.add("x"); randomKarakter.add("y");
        randomKarakter.add("z"); randomKarakter.add("0"); randomKarakter.add("1");
        randomKarakter.add("2"); randomKarakter.add("3"); randomKarakter.add("4");
        randomKarakter.add("5"); randomKarakter.add("6"); randomKarakter.add("7");
        randomKarakter.add("8"); randomKarakter.add("9");

            Random gen = new Random();

            int karakter = gen.nextInt(randomKarakter.size());
            return randomKarakter.get(karakter);
    }
    public static String generisiRandomSpecijalanKarakter() {

        ArrayList<String> randomSpecKarakter = new ArrayList<>();

        randomSpecKarakter.add("@"); randomSpecKarakter.add("#"); randomSpecKarakter.add("&");
        randomSpecKarakter.add("*"); randomSpecKarakter.add("!");

        Random gen = new Random();

        int specKarakter = gen.nextInt(randomSpecKarakter.size());
        return randomSpecKarakter.get(specKarakter);
    }
}
