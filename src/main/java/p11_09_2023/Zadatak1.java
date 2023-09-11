package p11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student a = new Student();

        a.setIme("Jova");
        a.setPrezime("Jovic");
        a.setBrInd(17823);
        a.setIsOnBudget(true);

        a.printStudentInfo();

    }
}
