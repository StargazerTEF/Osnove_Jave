package p18_09_2023.Zadatak1;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public VisaKartica(double sum, String cardNumber, int year, int month, String ovlascenoLice) {
        super(sum, cardNumber, year, month);
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public void izvrsiTransakciju (double vrednost) {
        if (vrednost * 1.8 / 100 >= 4) {
            this.sum -= (vrednost + vrednost * 1.8 / 100);
        } else {
            this.sum -= (vrednost + 4);
        }
    }
    @Override
    public void print () {
        System.out.print("Visa Card: " + this.cardNumber + ", " + this.month + "/" + this.year + ", $" + this.sum);
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
}

