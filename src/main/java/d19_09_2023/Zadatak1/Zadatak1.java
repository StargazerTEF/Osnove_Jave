package d19_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

// U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Korpa korpa = new Korpa();
        SuperKartica kartica = new SuperKartica("1231-423", "Aki Akic", 200);
        Tetrapak t1 = new Tetrapak("a1c-4215", "jogurt", 100, 120, true, 180);
        Tetrapak t2 = new Tetrapak("a2c-4214", "mleko", 70, 80, false, 120);

        StaklenaAmbalaza sa1 = new StaklenaAmbalaza("v3x-1432", "pivo", 100, 140, 20, true, 150);
        StaklenaAmbalaza sa2 = new StaklenaAmbalaza("v1z-2431", "somersby", 80, 120, 0, false, 180);

        t1.print();
        t2.print();
        sa1.print();
        sa2.print();

        korpa.addProducts(t1);
        korpa.addProducts(t2);
        korpa.addProducts(sa1);
        korpa.addProducts(sa2);

        korpa.removeProduct("a2c-4214");
        kartica.print();

        System.out.println("Vas ukupan racun je " + korpa.fullBill(kartica) + " rsd.");



    }
}
