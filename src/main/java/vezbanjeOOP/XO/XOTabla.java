package vezbanjeOOP.XO;

import java.util.ArrayList;
import java.util.Arrays;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeX;
    private String imeO;
    private String naPotezu;
    private ArrayList<String> polja;

    public XOTabla() {
        this.polja = new ArrayList<>(Arrays.asList(polje1, polje2, polje3, polje4, polje5, polje6, polje7, polje8, polje9));
    }

    public void pokreniIgru() {
        for (int i = 0; i < this.polja.size(); i++) {
            this.polja.set(i, " ");
        }
        this.naPotezu = "X";
    }

    public void print() {
        for (int i = 0; i < this.polja.size(); i++) {
            if (i == 2 || i == 5 || i == 8) {
                System.out.println(this.polja.get(i));
            } else {
                System.out.print(this.polja.get(i) + " | ");
            }
        }
        System.out.println("Igrac X: " + this.imeX);
        System.out.println("Igrac O: " + this.imeO);
    }

    public boolean poljePrazno(int potez) {
        for (int i = 0; i < this.polja.size(); i++) {
            if (this.polja.get(potez - 1).equals(" ")) {
                return true;
            }
        }
        return false;
    }

    public void zameniIgraca() {
        if (this.naPotezu.equals("X")) {
            this.naPotezu = "O";
        } else if (this.naPotezu.equals("O")) {
            this.naPotezu = "X";
        }
    }

    public void odigrajPotez(int potez) {
        for (int i = 0; i < this.polja.size(); i++) {
            this.polja.set(potez - 1, this.naPotezu);
        }
    }

    public boolean popunjenaTabla() {
        for (int i = 0; i < this.polja.size(); i++) {
            if (this.polja.get(i).equals(" ")) {
                return false;
            }
        }
        return true;
    }

    public boolean pobednikX () {
            if (this.polja.get(0).equals("X") && this.polja.get(1).equals("X") && this.polja.get(2).equals("X") ||
                    this.polja.get(3).equals("X") && this.polja.get(4).equals("X") && this.polja.get(5).equals("X") ||
                    this.polja.get(6).equals("X") && this.polja.get(7).equals("X") && this.polja.get(8).equals("X") ||
                    this.polja.get(0).equals("X") && this.polja.get(3).equals("X") && this.polja.get(6).equals("X") ||
                    this.polja.get(1).equals("X") && this.polja.get(4).equals("X") && this.polja.get(7).equals("X") ||
                    this.polja.get(2).equals("X") && this.polja.get(5).equals("X") && this.polja.get(8).equals("X") ||
                    this.polja.get(0).equals("X") && this.polja.get(4).equals("X") && this.polja.get(8).equals("X") ||
                    this.polja.get(2).equals("X") && this.polja.get(4).equals("X") && this.polja.get(6).equals("X")) {
                return true;
            }
            return false;
        }
       public boolean pobednikO () {
           if (this.polja.get(0).equals("O") && this.polja.get(1).equals("O") && this.polja.get(2).equals("O") ||
                   this.polja.get(3).equals("O") && this.polja.get(4).equals("O") && this.polja.get(5).equals("O") ||
                   this.polja.get(6).equals("O") && this.polja.get(7).equals("O") && this.polja.get(8).equals("O") ||
                   this.polja.get(0).equals("O") && this.polja.get(3).equals("O") && this.polja.get(6).equals("O") ||
                   this.polja.get(1).equals("O") && this.polja.get(4).equals("O") && this.polja.get(7).equals("O") ||
                   this.polja.get(2).equals("O") && this.polja.get(5).equals("O") && this.polja.get(8).equals("O") ||
                   this.polja.get(0).equals("O") && this.polja.get(4).equals("O") && this.polja.get(8).equals("O") ||
                   this.polja.get(2).equals("O") && this.polja.get(4).equals("O") && this.polja.get(6).equals("O")) {
               return true;
           }
           return false;
       }

    public String getImeX() {
        return imeX;
    }

    public void setImeX(String imeX) {
        this.imeX = imeX;
    }

    public String getImeO() {
        return imeO;
    }

    public void setImeO(String imeO) {
        this.imeO = imeO;
    }

    public String getNaPotezu() {
        return naPotezu;
    }
}
