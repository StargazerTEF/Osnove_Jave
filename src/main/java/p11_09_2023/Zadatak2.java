package p11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Tacka a = new Tacka();
        a.setX(10);
        a.setY(20);

        Tacka b = new Tacka(30, 40);

        a.print();
        b.print();
    }
}
