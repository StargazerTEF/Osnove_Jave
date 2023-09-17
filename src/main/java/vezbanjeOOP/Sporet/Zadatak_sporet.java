package vezbanjeOOP.Sporet;

import java.util.Scanner;

public class Zadatak_sporet {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Ringla ringla1 = new Ringla("obicna", 1.5);
        Ringla ringla2 = new Ringla("ekspres", 1);
        Ringla ringla3 = new Ringla("obicna", 1.5);
        Ringla ringla4 = new Ringla("ekspres", 0.8);

        ElektricniSporet sporet = new ElektricniSporet("LG", 5, 3, ringla1, ringla2, ringla3, ringla4);

        sporet.pojacajRinglu(1);
        sporet.pojacajRinglu(1);
        sporet.pojacajRinglu(1);
        sporet.pojacajRinglu(1);
        sporet.pojacajRinglu(1);
        sporet.pojacajRinglu(1);
        sporet.iskljuciRinglu(1);
        sporet.pojacajRinglu(1);

        ringla1.print();

        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);
        sporet.pojacajRinglu(2);

        ringla2.print();

        sporet.pojacajRinglu(3);

        ringla3.print();

        sporet.pojacajRinglu(4);
        sporet.pojacajRinglu(4);
        sporet.pojacajRinglu(4);

        ringla4.print();

        System.out.print("Koliko vec dugo radi ringla 1? ");
        double brSati1 = s.nextDouble();
        System.out.print("Koliko vec dugo radi ringla 2? ");
        double brSati2 = s.nextDouble();
        System.out.print("Koliko vec dugo radi ringla 3? ");
        double brSati3 = s.nextDouble();
        System.out.print("Koliko vec dugo radi ringla 4? ");
        double brSati4 = s.nextDouble();

        sporet.print();
        System.out.println("Potrosnja sporeta je " + sporet.izracunajPotrosnju(brSati1, brSati2, brSati3, brSati4) + "kW/h");

    }
}
