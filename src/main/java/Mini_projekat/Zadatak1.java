package Mini_projekat;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//**Zadatak: Simulacija skidanja tekstualnog fajla**
//Napišite program koji simulira proces skidanja tekstualnog fajla. Skidanje fajla se obavlja
//u paketima od po 5 karaktera. Pretpostavljamo da korisnik unosi podatke u skladu sa sledećim
//zahtevima:
//Korisnik unosi veličinu fajla u bajtovima, pri čemu svaki karakter zauzima 1 bajt.
//Ako broj karaktera u fajlu nije deljiv sa 5, poslednji paket će sadržati manje od 5 karaktera.
//Korisnik će biti upitan za podatke svakog paketa kroz for petlju. Nakon unosa svakog paketa,
//program treba da prikaže procenat trenutno skinutog fajla. Na programu je da odredi koliko
//paketa je potrebno za ceo fajl.
//Na kraju programa, ispišite sadržaj celog fajla.
//Primer izvršenja 1:
//Unesite veličinu fajla: 25                        Primer izvršenja 2:
//Unesite paket: soiek                              Unesite veličinu fajla: 27
//Skinuto 20.0%                                     Unesite paket: soiek
//Unesite paket: ew43t                              Skinuto 18.5%
//Skinuto 40.0%                                     Unesite paket: ew43t
//Unesite paket: tr5y7                              Skinuto 37.0%
//Skinuto 60.0%                                     Unesite paket: tr5y7
//Unesite paket: dbtu6                              Skinuto 55.5%
//Skinuto 80.0%                                     Unesite paket: dbtu6
//Unesite paket: 6ghku                              Skinuto 74.0%
//Skinuto 100.0%                                    Unesite paket: 6ghku
//Sadržaj fajla je: soiekew43ttr5y7dbtu66ghku       Skinuto 92.5%
//                                                  Unesite paket: cc
//                                                  Skinuto 100.0%
//                                                  Sadržaj fajla je: soiekew43ttr5y7dbtu66ghkucc
//Napomena: Posto je procenat realan broj, u stampi ce se prikazati vise cifara iza zareza.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite velicinu fajla: ");
        int fileSize = s.nextInt();

        int brojIteracija;
        double procenat = 0;
        String fileName = "";

        if (fileSize % 5 == 0) {
            brojIteracija = fileSize / 5;
        } else {
            brojIteracija = fileSize / 5 + 1;
        }

        for (int i = 0; i < brojIteracija; i++) {
            System.out.print("Unesite paket: ");
            String paket = s.next();
            fileName += paket;
            procenat += paket.length() * 100.0 / fileSize;
            System.out.println("Skinuto " + procenat + "%");
        }
            System.out.print("Sadrzaj fajla je: " + fileName);
    }
}
