package d25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//Metoda nista ne vraca.

        userInfo("2319452302132", "Ivan", "Ivanovic", 1993, true);

    }
    public static void userInfo (String jmbg, String ime, String prezime, int godRodj, boolean activity) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godRodj + ".");
        System.out.println("Aktivan: " + activity);
    }
}
