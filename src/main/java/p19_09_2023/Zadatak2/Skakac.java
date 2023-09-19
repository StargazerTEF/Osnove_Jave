package p19_09_2023.Zadatak2;

public class Skakac extends Atleticar{

    public Skakac() {
    }

    public Skakac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean daLiJeRezultatBolji(Atleticar atleticar) {
        if (this.rezultat > atleticar.getRezultat()) {
            return true;
        }
        return false;
    }

}
