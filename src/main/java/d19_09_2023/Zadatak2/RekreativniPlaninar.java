package d19_09_2023.Zadatak2;

public class RekreativniPlaninar extends Planinar {
//Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru:
//težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//naziv okruga odakle je rekreativni planinar.
//maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram
//opreme koji nosi može da pređe 50 metara manje.
//rekeativci placaju clanarinu u iznosu od 1000 rsd
//metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)

    private int equipmentWeight;
    private String county;
    private double maximumClimbWithoutEquipment;

    public RekreativniPlaninar(int id, String fullName, int equipmentWeight, String county, double maximumClimbWithoutEquipment) {
        super(id, fullName);
        this.equipmentWeight = equipmentWeight;
        this.county = county;
        this.maximumClimbWithoutEquipment = maximumClimbWithoutEquipment;
    }

    @Override
    public double mountaineerFee() {
        return 1000;
    }

    @Override
    public boolean successfulClimb(Planina planina) {
        return this.maximumClimbWithoutEquipment - this.equipmentWeight * 50 >= planina.getHeight();
    }

    @Override
    public void print() {
        System.out.println("Rekreativac, id: " + this.id);
        System.out.println("Ime: " + this.fullName);
        System.out.println("Okrug: " + this.county);
        System.out.println();
    }
    public int getEquipmentWeight() {
        return equipmentWeight;
    }

    public String getCounty() {
        return county;
    }

    public double getMaximumClimbWithoutEquipment() {
        return maximumClimbWithoutEquipment;
    }
}
