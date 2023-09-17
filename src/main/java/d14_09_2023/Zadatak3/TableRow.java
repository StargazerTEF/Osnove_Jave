package d14_09_2023.Zadatak3;

import java.util.ArrayList;

public class TableRow {
    private ArrayList<String> cells;

    public TableRow() {
        this.cells = new ArrayList<>();
    }

    public void addRowCell (String cell) {
        this.cells.add(cell);
    }
    public void print () {
        for (int i = 0; i < this.cells.size(); i++) {
            System.out.print(this.cells.get(i) + "\t\t|\t\t");
        }
        System.out.println();
    }
    public void printHTML () {
        System.out.print("<tr>");
        for (int i = 0; i < this.cells.size(); i++) {
            System.out.print("<td>" + this.cells.get(i) + "</td>");
        }
        System.out.println("</tr>");
    }

    public boolean daLiSeSadrziTekst (String tekst) {
        for (int i = 0; i < this.cells.size(); i++) {
            if (this.cells.get(i).equals(tekst)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getCells() {
        return cells;
    }
}
