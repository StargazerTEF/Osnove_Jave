package d25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj
//konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno
//izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati
//funkciju za neki od primera.
//Primer poziva funkcija:
//Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//Primer izvrsenja main programa:
//Unesite vrednost u eurima: 3
//Unesite valutu za konverziju: RSD
//3 EUR je 351.6339 RSD
//Konverzija eura u druge valute:
//1 EUR = 117.5 RSD
//1 EUR = 1.1 USD
//1 EUR = 62.98 RUB

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost u eurima: ");
        double suma = s.nextDouble();

        System.out.print("Unesite valutu za konverziju: ");
        String valuta = s.next();

        double isplata = menjacnica(suma, valuta);
        System.out.println("Za isplatu: " + isplata);
    }
public static double menjacnica (double suma, String valuta) {
        double kurs;
        if (valuta.equals("RSD")) {
            kurs = suma * 117.5;
        } else if (valuta.equals("USD")) {
            kurs = suma * 1.1;
        } else if (valuta.equals("RUB")) {
            kurs = suma * 62.98;
        } else {
            kurs = 0;
        }
        return kurs;
    }
}
