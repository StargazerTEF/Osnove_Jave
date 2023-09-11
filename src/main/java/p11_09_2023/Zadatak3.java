package p11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Film a = new Film();
        a.setName("Space Odyssey 2001");
        a.setYear(1968);

        Reziser r = new Reziser();
        r.setFullName("Stanley Kubrick");
        r.setYears(70);

        a.setReziraoGa(r);
        a.printFilmInfo();

    }
}
