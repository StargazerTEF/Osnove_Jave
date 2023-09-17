package vezbanjeOOP.XO;

import java.util.Scanner;

public class ZadatakXO {
    public static void main(String[] args) {

        XOTabla tabla = new XOTabla();

        Scanner s = new Scanner(System.in);
        System.out.print("Ime igraca X: ");
        String imeX = s.next();
        System.out.print("Ime igraca O: ");
        String imeO = s.next();

        tabla.setImeX(imeX);
        tabla.setImeO(imeO);

        tabla.pokreniIgru();

        boolean hasWinner = false;
        int i = 0;
        while (!hasWinner && i < 9) {
            tabla.print();
            System.out.println("Na potezu je igrac " + tabla.getNaPotezu());
            System.out.print("Igrac " + tabla.getNaPotezu() + " odigrajte potez: ");
            int potez = s.nextInt();
            if (!tabla.poljePrazno(potez)) {
                System.out.println("Potez nije validan.");
            } else {
                tabla.odigrajPotez(potez);
                tabla.zameniIgraca();
            }
            if (tabla.pobednikX() || tabla.pobednikO() || tabla.popunjenaTabla()) {
                hasWinner = true;
            }
            i++;
        }
        if (tabla.pobednikX()) {
            System.out.println("Cestitamo! Pobedio je igrac " + imeX);
            System.out.println("Bravo " + imeX);
        } else if (tabla.pobednikO()) {
            System.out.println("Cestitamo! Pobedio je igrac " + imeO);
            System.out.println("Bravo " + imeO);
        } else {
            System.out.println("Igra je neresena.");
        }
    }
}
