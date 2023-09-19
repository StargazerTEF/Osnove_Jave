package p18_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

        StudentOsnovnih so1 = new StudentOsnovnih();
        StudentMaster sm1 = new StudentMaster();

        so1.setPunoIme("Milan Jovanovic");
        so1.setBrIndeksa(192);
        so1.setGodStudija(3);

        sm1.setPunoIme("Vlada Minic");
        sm1.setBrIndeksa(193);
        sm1.setGodStudija(2);

        so1.print();
        sm1.print();

    }
}
