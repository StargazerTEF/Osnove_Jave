package p19_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

// U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 5 razlicita objekta i istestirati sve metode.

        Kuca k1 = new Kuca("Kozarska 9", 50, 2, 3);
        Kuca k2 = new Kuca("Milesevska 11", 85, 3, 4);
        Zgrada z1 = new Zgrada("Prvomajska 23", 300, 1, 8);
        Zgrada z2 = new Zgrada("Niska 12", 520, 2, 22);
        Lokal l1 = new Lokal("Prvomajska 23", 90, 1);

        PoreskaUprava nis = new PoreskaUprava("Nis");
        nis.dodajObjekat(k1);
        nis.dodajObjekat(k2);
        nis.dodajObjekat(z1);
        nis.dodajObjekat(z2);
        nis.dodajObjekat(l1);

        nis.najveciPorez().print();
        nis.najmanjiPorez().print();
        System.out.println(nis.ukupanPorez());
        nis.print();
    }
}
