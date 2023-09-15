package p15_09_2023;

public class MasterKartica extends PlatnaKartica {

    public MasterKartica(double sum, String cardNumber, int year, int month) {
        super(sum, cardNumber, year, month);
    }
    @Override
    public void izvrsiTransakciju(double vrednost) {
        this.sum -= (vrednost + vrednost * 1.5 / 100);
    }
    public void naplatiOdrzavanje () {
        this.sum -= 2;
    }
    @Override
    public void print () {
        System.out.println("Master Card: " + this.month + "/" + this.year + ", " + this.cardNumber + ", $" + this.sum);
    }
}
