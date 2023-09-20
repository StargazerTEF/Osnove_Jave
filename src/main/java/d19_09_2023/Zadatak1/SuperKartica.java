package d19_09_2023.Zadatak1;

public class SuperKartica {
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)

    private String cardNumber;
    private String fullUserName;
    private double discount;

    public SuperKartica() {
    }

    public SuperKartica(String cardNumber, String fullUserName, double discount) {
        this.cardNumber = cardNumber;
        this.fullUserName = fullUserName;
        this.discount = discount;
    }

    public void print () {
        System.out.println("Kartica: " + this.cardNumber + ", " + this.fullUserName);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFullUserName() {
        return fullUserName;
    }

    public void setFullUserName(String fullUserName) {
        this.fullUserName = fullUserName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
