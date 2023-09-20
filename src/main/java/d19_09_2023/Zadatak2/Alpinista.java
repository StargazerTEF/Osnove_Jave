package d19_09_2023.Zadatak2;

public class Alpinista extends Planinar {
//Kreirati klasu Alpinista koja nasleđuje klasu Planinar. Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati.
//Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
//Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)

    private int numberOfPoints;


    public Alpinista(int id, String fullName, int numberOfPoints) {
        super(id, fullName);
        this.numberOfPoints = numberOfPoints;
    }

    @Override
    public double mountaineerFee() {
        if (1500 - this.numberOfPoints * 50 > 0) {
            return 1500 - this.numberOfPoints * 50;
        } else {
            return 0;
        }
    }

    @Override
    public boolean successfulClimb(Planina planina) {
        return planina.getHeight() <= 4000;
    }

    @Override
    public void print() {
        System.out.println("Alpinista, id: " + this.id);
        System.out.println("Ime: " + this.fullName);
        System.out.println("Broj poena: " + this.numberOfPoints);
        System.out.println();
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
}
