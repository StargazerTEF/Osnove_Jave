package p12_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Korisnik host = new Korisnik();
        host.setFullName("Aca Akic");
        Korisnik guest = new Korisnik();
        guest.setFullName("Maja Majic");

        ZoomCall call1 = new ZoomCall("https://ukljucise.com", "12345*", host);
        call1.setKorisnikGuest(guest);

        host.payLicence(150);
        call1.print();

    }
}
