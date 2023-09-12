package p12_09_2023;

public class Zadatak3 {
        public static void main(String[] args) {


                ViberKorisnik sender = new ViberKorisnik("Aca Akic", "0637659831", true);
                ViberKorisnik receiver = new ViberKorisnik("Maja Majic", "0617892356", false);

                ViberReakcija reaction = new ViberReakcija("smile", sender);

                ViberPoruka poruka1 = new ViberPoruka("Ej cao, sta ima?", "12:48", sender, receiver, reaction);
                ViberPoruka poruka2 = new ViberPoruka("Sta hoces?", "13:05", receiver, sender, reaction);

                poruka1.printInfo();
        }
}
