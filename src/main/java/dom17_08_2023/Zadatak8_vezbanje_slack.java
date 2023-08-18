package dom17_08_2023;

import java.util.Scanner;

public class Zadatak8_vezbanje_slack {
    public static void main(String[] args) {

        /*Tea Tairovic je zatrazila od svojih najvernijih fanova ako mogu da joj izadju
 u susret i razviju softver za njene potrebe. Najveci fan Veljko se javio i iz razgovora
 je izvukao sta je potrebno da softver radi. Posto je izbacila 3 najveca hita, potrebno joj je
 da sracuna zaradu od pregleda na youtubu. Tea zaradjuje $1 na 1000 pregleda. Dok ne dodje do
 50k pregleda, sve sto se zaradi sa youtube-a ostaje njoj. Ukoliko ima od 50k do 100k pregleda
 njen mendzer joj uzima fiksno $50, a sve preko 100k pregleda dele po pola. Program sa
 tastature ucitava ukupan broj pregleda jednog videa i ispisuje koliko ce Tea zaraditi od njega. */

        Scanner s = new Scanner(System.in);

        System.out.println("Ukucajte broj pregleda: ");
        int views = s.nextInt();

        double zarada = views * 1.0/1000;

        if (views < 50000) {
            zarada = zarada;
        }
        if (views >= 50000 && views < 100000) {
            zarada = zarada - 50;
        }
        if (views >= 100000) {
            zarada = zarada/2;
        }
        System.out.println("Na osnovu trenutnih pregleda Tea zaradjuje: " + zarada + "$");





    }
}
