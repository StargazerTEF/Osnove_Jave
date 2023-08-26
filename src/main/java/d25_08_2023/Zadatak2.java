package d25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca
//novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

    int newResult = vratiNovuVrednost(6, 2);
        System.out.println("Nova vrednost je " + newResult);
    }
    public static int vratiNovuVrednost(int a, int b) {
        int newValue = a * 10 + b;
        return newValue;
    }
}
