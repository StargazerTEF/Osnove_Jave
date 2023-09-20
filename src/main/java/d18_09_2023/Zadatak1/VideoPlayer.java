package d18_09_2023.Zadatak1;

public class VideoPlayer {
//Kreirati klasu VideoPlayer koja ima:
//duzinu videa
//trenutno vreme videa
//jacinu zvuka
//Kvalitet videa (144, 240, 360, 480, 720, 1080)
//gettere, settere i konstruktore
//metodu stampaj koja stampa podatke u formatu:
//trenutno vreme videa
//jacina zvuka
//kavlitet videa

    private int duzina;
    private int trenutnoVreme;
    private int zvuk;
    private int kvalitet;

    public VideoPlayer() {
    }

    public VideoPlayer(int duzina, int trenutnoVreme, int zvuk, int kvalitet) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.zvuk = zvuk;
        this.kvalitet = kvalitet;
    }

    public void print () {
        System.out.println("Trenutno vreme videa: " + this.trenutnoVreme);
        System.out.println("Jacina zvuka: " + this.zvuk);
        System.out.println("Kvalitet videa: " + this.kvalitet);
    }

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getZvuk() {
        return zvuk;
    }

    public void setZvuk(int zvuk) {
        this.zvuk = zvuk;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }
}
