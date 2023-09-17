package vezbanjeOOP.Sporet;

public class ElektricniSporet {
    private String marka;
    private int garancija;
    private int maxBrUkljucenihRingli;
    private Ringla ringlaGoreLevo;
    private Ringla ringlaGoreDesno;
    private Ringla ringlaDoleLevo;
    private Ringla ringlaDoleDesno;

    public ElektricniSporet (String marka, int garancija, int maxBrUkljucenihRingli, Ringla ringlaGoreLevo, Ringla ringlaGoreDesno, Ringla ringlaDoleLevo, Ringla ringlaDoleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maxBrUkljucenihRingli = maxBrUkljucenihRingli;
        this.ringlaGoreLevo = ringlaGoreLevo;
        this.ringlaGoreDesno = ringlaGoreDesno;
        this.ringlaDoleLevo = ringlaDoleLevo;
        this.ringlaDoleDesno = ringlaDoleDesno;
    }

    public String getMarka() {
        return marka;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaxBrUkljucenihRingli() {
        return maxBrUkljucenihRingli;
    }

    public Ringla getRinglaGoreLevo() {
        return ringlaGoreLevo;
    }

    public Ringla getRinglaGoreDesno() {
        return ringlaGoreDesno;
    }

    public Ringla getRinglaDoleLevo() {
        return ringlaDoleLevo;
    }

    public Ringla getRinglaDoleDesno() {
        return ringlaDoleDesno;
    }
    public void pojacajRinglu (int pozicija) {
        int counter = 0;
        if (pozicija == 1) {
            this.ringlaGoreLevo.pojacajRinglu();
        } if (pozicija == 2) {
            this.ringlaGoreDesno.pojacajRinglu();
        } if (pozicija == 3) {
            this.ringlaDoleLevo.pojacajRinglu();
        } if (pozicija == 4) {
            this.ringlaDoleDesno.pojacajRinglu();
        }
            if (this.ringlaGoreLevo.daLiJeRinglaUkljucena()) {
            counter++;
        } if (this.ringlaGoreDesno.daLiJeRinglaUkljucena()) {
            counter++;
        } if (this.ringlaDoleLevo.daLiJeRinglaUkljucena()) {
            counter++;
        } if (this.ringlaDoleDesno.daLiJeRinglaUkljucena()) {
            counter++;
        }
            if (counter > this.maxBrUkljucenihRingli) {
           if (pozicija != 1) {
               this.ringlaGoreLevo.iskljuciRinglu();
           } if (pozicija != 2) {
                this.ringlaGoreDesno.iskljuciRinglu();
            } if (pozicija != 3) {
                this.ringlaDoleLevo.iskljuciRinglu();
            } if (pozicija != 4) {
                this.ringlaDoleDesno.iskljuciRinglu();
            }
        }
    }
    public void iskljuciRinglu (int pozicija) {
        if (pozicija == 1) {
            this.ringlaGoreLevo.iskljuciRinglu();
        } else if (pozicija == 2) {
            this.ringlaGoreDesno.iskljuciRinglu();
        } else if (pozicija == 3) {
            this.ringlaDoleLevo.iskljuciRinglu();
        } else if (pozicija == 4) {
            this.ringlaDoleDesno.iskljuciRinglu();
        }

    }
    public double izracunajPotrosnju (double brSati1, double brSati2, double brSati3, double brSati4) {
        return this.ringlaDoleDesno.potrosnjaElEnergije(brSati1) + this.ringlaDoleLevo.potrosnjaElEnergije(brSati2) + this.ringlaGoreDesno.potrosnjaElEnergije(brSati3) + this.ringlaGoreLevo.potrosnjaElEnergije(brSati4);
    }

    public void print () {
        System.out.println(this.marka + " - " + this.garancija + " godina garancije");
        System.out.println("Ringle: ");
        System.out.println("Gore levo: ");
        this.ringlaGoreLevo.print();
        System.out.println("Gore desno: ");
        this.ringlaGoreDesno.print();
        System.out.println("Dole levo: ");
        this.ringlaDoleLevo.print();
        System.out.println("Dole desno: ");
        this.ringlaDoleDesno.print();
    }
}
