package d07_09_2023;

public class Zadatak6 {
    public static void main(String[] args) {

//Zadatak 6: Upravljanje Flotom Vozila - Rešite Poslovni Problem
//Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem. Radite za kompaniju za dostavu
//koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila. Vaš zadatak je da razvijete softver za
//efikasno praćenje i upravljanje resursima kompanije.
//Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave. Vaš cilj je da
//identifikujete potrebne klase za rešavanje ovog problema.
//
//**Scenario:**
//Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku, model,
//registarski broj i godinu proizvodnje. Vozači su takođe deo flote i svaki vozač ima svoje lične informacije,
//uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
//Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute
//(u kilometrima) i očekivano vreme putovanja. Vaš zadatak je da definišete potrebne klase za praćenje i
//upravljanje ovim resursima kako biste pomogli kompaniji da optimizuje svoje poslovanje.
//Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem upravljanja
//vozilima, vozačima, rutama i dostavama. Kreirajte klase sa odgovarajućim atributima kako biste omogućili
//upravljanje ovim resursima i u glavnom programu kreirajte objekte.

        Vozila a = new Vozila();
        Vozila b = new Vozila();

        a.marka = "Ford";
        a.model = "Fiesta";
        a.godiste = 2015;
        a.regBr = "320-45-RD";

        b.marka = "Ford";
        b.model = "Fiesta";
        b.godiste = 2015;
        b.regBr = "320-45-RD";

        Vozaci p = new Vozaci();
        Vozaci q = new Vozaci();

        p.ime = "Mile";
        p.prezime = "Milic";
        p.jmbg = "0421977314456";
        p.brDozvole = "324-518";
        p.datumIstekaDozvole = 2025;

        q.ime = "Ika";
        q.prezime = "Ikic";
        q.jmbg = "1312975321515";
        q.brDozvole = "325-519";
        q.datumIstekaDozvole = 2026;

        Dostave x = new Dostave();
        Dostave y = new Dostave();

        x.id = 1;
        x.posiljalac = "Soko Stark";
        x.primalac = "Kolibri";
        x.vreme = 5;
        x.status = true;

        y.id = 2;
        y.posiljalac = "Bambi";
        y.primalac = "Astra";
        y.vreme = 3;
        y.status = false;

        Rute k = new Rute();
        Rute l = new Rute();

        k.polaziste = "Nis";
        k.odrediste = "Beograd";
        k.duzina = 200;

        l.polaziste = "Novi Sad";
        l.odrediste = "Subotica";
        l.duzina = 150;

        System.out.println("Posiljka pod id brojem: " + x.id + " - salje " + x.posiljalac + " paket od " + k.polaziste + " do " + k.odrediste
        + " za firmu " + x.primalac + ", vreme predvidjeno za isporuku - " + x.vreme + "h, vozac " + p.ime + " u vozilu " +
                a.marka + " " + a.model + " reg. tablice " + a.regBr);

    }
}
