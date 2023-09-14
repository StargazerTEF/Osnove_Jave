package p14_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {


        HistoryPage page1 = new HistoryPage("page1", "www.history.com", 11, 27);
        HistoryPage page2 = new HistoryPage("page2", "www.evidence.com", 10, 37);

        History history = new History();
        history.otvoriStranicu(page1);
        history.otvoriStranicu(page2);
        history.pogledajIstoriju();
        history.sacuvajKredencijale("www.itbootcamp.com", "user", "pass");
        history.pogledajIstoriju();
        history.obrisiSveKolaciceZaPoslSatVr(11, 32);
        history.pogledajIstoriju();
        history.obrisiIstoriju();
        history.pogledajIstoriju();

    }
}
