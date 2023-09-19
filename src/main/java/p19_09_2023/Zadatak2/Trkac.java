package p19_09_2023.Zadatak2;

public class Trkac extends Atleticar {

//Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.


    public Trkac() {
    }

    public Trkac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean daLiJeRezultatBolji(Atleticar atleticar){
            if (this.rezultat < atleticar.getRezultat()) {
                return true;
            }
            return false;
        }
}
