package d14_09_2023.Zadatak3;

import java.util.Scanner;
import java.util.SortedMap;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        TableHeader th1 = new TableHeader();
        th1.addHeaderCell("First Name");
        th1.addHeaderCell("Last Name");
        th1.addHeaderCell("Age");

        TableRow tr1 = new TableRow();
        TableRow tr2 = new TableRow();
        TableRow tr3 = new TableRow();
        TableRow tr4 = new TableRow();
        TableRow tr5 = new TableRow();
        TableRow tr6 = new TableRow();
        TableRow tr7 = new TableRow();
        TableRow tr8 = new TableRow();
        TableRow tr9 = new TableRow();
        TableRow tr10 = new TableRow();
        TableRow tr11 = new TableRow();
        TableRow tr12 = new TableRow();
        TableRow tr13 = new TableRow();
        TableRow tr14 = new TableRow();
        TableRow tr15 = new TableRow();
        TableRow tr16 = new TableRow();

        tr1.addRowCell("Miroslav");
        tr1.addRowCell("Jovanovic");
        tr1.addRowCell("27");
        tr2.addRowCell("Viseslav");
        tr2.addRowCell("Petrovic");
        tr2.addRowCell("29");
        tr3.addRowCell("Radislav");
        tr3.addRowCell("Darkovic");
        tr3.addRowCell("30");
        tr4.addRowCell("Tomislav");
        tr4.addRowCell("Zarkovic");
        tr4.addRowCell("32");
        tr5.addRowCell("Svetolik");
        tr5.addRowCell("Jankovic");
        tr5.addRowCell("33");
        tr6.addRowCell("Svetomir");
        tr6.addRowCell("Majkovic");
        tr6.addRowCell("23");
        tr7.addRowCell("Miladinka");
        tr7.addRowCell("Markovic");
        tr7.addRowCell("24");
        tr8.addRowCell("Sretenija");
        tr8.addRowCell("Jovanovic");
        tr8.addRowCell("38");
        tr9.addRowCell("Aleksandar");
        tr9.addRowCell("Aleksovic");
        tr9.addRowCell("28");
        tr10.addRowCell("Desimirko");
        tr10.addRowCell("Ilinkovic");
        tr10.addRowCell("22");
        tr11.addRowCell("Miroslav");
        tr11.addRowCell("Utvarkovic");
        tr11.addRowCell("34");
        tr12.addRowCell("Zaharije");
        tr12.addRowCell("Danilovic");
        tr12.addRowCell("32");
        tr13.addRowCell("Miroslav");
        tr13.addRowCell("Ivanovic");
        tr13.addRowCell("35");
        tr14.addRowCell("Zelimirko");
        tr14.addRowCell("Inosevic");
        tr14.addRowCell("36");
        tr15.addRowCell("Danijela");
        tr15.addRowCell("Ivanisevic");
        tr15.addRowCell("31");
        tr16.addRowCell("Simonida");
        tr16.addRowCell("Jovicevic");
        tr16.addRowCell("35");

        Table table = new Table(th1);

        table.addTableRow(tr1);
        table.addTableRow(tr2);
        table.addTableRow(tr3);
        table.addTableRow(tr4);
        table.addTableRow(tr5);
        table.addTableRow(tr6);
        table.addTableRow(tr7);
        table.addTableRow(tr8);
        table.addTableRow(tr9);
        table.addTableRow(tr10);
        table.addTableRow(tr11);
        table.addTableRow(tr12);
        table.addTableRow(tr13);
        table.addTableRow(tr14);
        table.addTableRow(tr15);
        table.addTableRow(tr16);

        System.out.print("Unesite broj strana: ");
        int brStrana = s.nextInt();
        System.out.print("Unesite broj redova po strani: ");
        int brRedova = s.nextInt();

        table.print(brStrana, brRedova);
        table.printHTML();

        table.filter("Miroslav");


    }
}
