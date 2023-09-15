package p15_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        VisaKartica v1 = new VisaKartica(58975.82, "4012-1239-1221-3381", 2019, 11, "Aki Akic");

        MasterKartica m1 = new MasterKartica(1786.82, "4012-1239-1221-3381", 2019, 12);
        v1.izvrsiTransakciju(5498.76);
        m1.naplatiOdrzavanje();
        m1.izvrsiTransakciju(500);

        m1.print();
        v1.print();
    }
}
