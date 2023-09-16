package d15_09_2023.Zadatak1;

public class Trener extends Osoba{

    private int godineIskustva;
    private String tipTrenera;

    public Trener() {

    }

    public Trener(String punoIme, String jmbg, int godRodjenja, int godineIskustva, String tipTrenera) {
        super(punoIme, jmbg, godRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void print () {
        super.print();
        System.out.println(this.godineIskustva + " godina iskutva - " + this.tipTrenera + " trener");
        System.out.println();
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }
}
