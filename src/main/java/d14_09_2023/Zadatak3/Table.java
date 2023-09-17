package d14_09_2023.Zadatak3;

import java.util.ArrayList;

public class Table {
    private TableHeader tableHeader;
    private ArrayList<TableRow> tableRows;
    private int brRedovaPoStrani;

    public Table(TableHeader tableHeader) {
        this.tableHeader = tableHeader;
        this.tableRows = new ArrayList<>();
    }

    public void addTableRow (TableRow tableRow) {
        this.tableRows.add(tableRow);
    }

    public void print (int brStrana, int brRedova) {
        this.tableHeader.print();
        for (int i = brStrana * brRedova - brRedova; i < brStrana * brRedova; i++) {
            this.tableRows.get(i).print();
        }
        System.out.println("Broj redova po strani: " + brRedova);
        if (this.tableRows.size() % brRedova != 0) {
        for (int i = 1; i <= (this.tableRows.size() / brRedova) + 1; i++) {
            System.out.print("| " + i + " ");
            }
        } else {
            for (int i = 1; i <= this.tableRows.size() / brRedova; i++) {
                    System.out.print("| " + i + " ");
                }
            }
        System.out.println();
    }
    public void printHTML () {
        System.out.println("<table>");
        System.out.println("<thead>");
        this.tableHeader.printHTML();
        System.out.println("</thead>");
        System.out.println("<tbody>");
        for (int i = 0; i < this.tableRows.size(); i++) {
            this.tableRows.get(i).printHTML();
        }
        System.out.println("</tbody>");
        System.out.println("</table>");
    }

    public void filter (String tekst) {
        this.tableHeader.print();
        for (int i = 0; i < tableRows.size(); i++) {
            if (this.tableRows.get(i).daLiSeSadrziTekst(tekst)) {
                this.tableRows.get(i).print();
            }
        }
    }

    public void setTableHeader(TableHeader tableHeader) {
        this.tableHeader = tableHeader;
    }

    public ArrayList<TableRow> getTableRows() {
        return tableRows;
    }
}
