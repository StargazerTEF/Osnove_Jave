package p15_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student s1 = new Student("Aki Akic", "12052378491");
        Student s2 = new Student("Maja Majic", "13102348452");
        s1.setBrIndexa(139);
        s1.setDug(5428.99);
        s2.setBrIndexa(142);
        s2.setDug(468.99);

        Profesor p1 = new Profesor("Zoran Zoric", "1402764298", "Osnove Jave", 120000);
        Profesor p2 = new Profesor("Milan Milic", "2708725213", "Objektno programiranje",135000);

        s1.print();
        s2.print();
        p1.print();
        p2.print();

    }
}
