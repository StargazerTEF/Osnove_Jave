package d19_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

// U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3), i istestirati svaku od metoda.

        PlaninarskiDom planinarskiDom = new PlaninarskiDom("Everest", 1948);

        Planina p1 = new Planina("Stara planina", "Serbia", 2376);

        RekreativniPlaninar rp1 = new RekreativniPlaninar(182, "Aki Akic", 10, "Niski", 1870);
        RekreativniPlaninar rp2 = new RekreativniPlaninar(176, "Maja Majic", 6, "Moravski", 1723.87);
        RekreativniPlaninar rp3 = new RekreativniPlaninar(132, "Zika Zikic", 12, "Pcinjski", 2120);

        Alpinista a1 = new Alpinista(2, "Zoran Subic", 123);
        Alpinista a2 = new Alpinista(7, "Jovan Jovic", 110);
        Alpinista a3 = new Alpinista(23, "Ika Ikic", 150);

        planinarskiDom.addMountaineer(rp1);
        planinarskiDom.addMountaineer(rp2);
        planinarskiDom.addMountaineer(rp3);
        planinarskiDom.addMountaineer(a1);
        planinarskiDom.addMountaineer(a2);
        planinarskiDom.addMountaineer(a3);

        System.out.println("Broj planinara koji se uspesno popeo na " + p1.getName() + " je " + planinarskiDom.numberOfSuccessfulClimbs(p1));
        System.out.println();
        planinarskiDom.print();
        System.out.println("Ukupna clanarina za planinarski dom " + planinarskiDom.getName() + " iznosi " + planinarskiDom.fullMountaineersFee() + " rsd");
        System.out.println();

        planinarskiDom.removeMountaineer(182);

        planinarskiDom.print();
        System.out.println("Ukupna clanarina za planinarski dom " + planinarskiDom.getName() + " iznosi " + planinarskiDom.fullMountaineersFee() + " rsd");

    }
}
