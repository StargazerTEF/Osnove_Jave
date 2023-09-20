package d19_09_2023.Zadatak2;

public abstract class Planinar {
//Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima:
//jedinstveni celobrojni identifikacioni broj
//ime i prezime
//Dok od javnih metoda:
//konstruktor koji postavlja sve atribute klase.
//gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u konstruktoru)
//apstraktnu metodu štampaj
//apstraktnu metodu koja vraca clanarinu planinara
//apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.

    protected int id;
    protected String fullName;

    public Planinar(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public abstract void print();

    public abstract double mountaineerFee();

    public abstract boolean successfulClimb(Planina planina);

    public int getJcib() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
