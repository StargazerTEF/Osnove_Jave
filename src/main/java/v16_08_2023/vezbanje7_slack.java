package v16_08_2023;

public class vezbanje7_slack {
    public static void main(String[] args) {

        //Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se baterija na telefonu napuni do 100%. Program od informacija cuva:
        //Naziv telefona
        //Kapacitet baterije u mAh (miliamper sat)
        //Trenutna napunjenost baterije u % (procentima)
        //Struja punjenja u mA (miliamper)
        //Teorijski: Struja punjenja nam kaze koliko se miliampera napuni za 1h punjenja.
        //Primer izvrsenja:
        //Iphone 11 pro max
        //Kapacitet baterije: 3000mAh
        //Baterija trenutno na 20%
        //Struja punjenja 1000mA
        //Procenjeno vreme punjenja je 2.4h.

        String phoneName = "Iphone 11 pro max";
        int batCap = 3000, batCharged = 20, elecStr = 1000;

        double batFullyCharged = (batCap - batCap * batCharged * 0.01) / elecStr;

        System.out.println(phoneName);
        System.out.println("Kapacitet baterije: " + batCap + "mA");
        System.out.println("Baterija trenutno na " + batCharged + "%");
        System.out.println("Struja punjenja je " + elecStr + "mAh");
        System.out.println("Procenjeno vreme punjenja je " + batFullyCharged + "h");


    }
}
